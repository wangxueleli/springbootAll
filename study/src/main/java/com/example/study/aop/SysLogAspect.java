package com.example.study.aop;

import com.example.study.annotation.ControllerMonitor;
import com.example.study.dao.SysLogDOMapper;
import com.example.study.entity.SysLogDO;
import com.example.study.utils.IPUtil;
import com.example.study.utils.JsonUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Author:xuelei.wang
 * @create 2020-01-29-13:58
 * @describe
 */
@Aspect
@Component
public class SysLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(SysLogAspect.class);

    @Autowired
    private SysLogDOMapper sysLogDOMapper;

    @Pointcut("@annotation(com.example.study.annotation.ControllerMonitor)")
    public void SysLogCut() {
    }

    @Around("SysLogCut()")
    public Object around(ProceedingJoinPoint point) {
        long beginTime = System.currentTimeMillis();
        Object result = null;
        try {
            logger.info("开始执行方法");
            result = point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long time = System.currentTimeMillis() - beginTime;
        saveLog(point, time, result);
        return result;
    }

    private void saveLog(ProceedingJoinPoint joinPoint, long time, Object result) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        SysLogDO sysLogDO = new SysLogDO();
        ControllerMonitor logAnnotation = method.getAnnotation(ControllerMonitor.class);
        if (logAnnotation != null) {
            // 注解上的描述
            sysLogDO.setOperator(logAnnotation.value());
        }
        // 请求的方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = signature.getName();
        sysLogDO.setMethod(className + "." + methodName + "()");
        // 请求的方法参数值
        Object[] args = joinPoint.getArgs();
        // 请求的方法参数名称
        sysLogDO.setParam(JsonUtil.objectToJson(args));
        // 获取request
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 设置IP地址
        sysLogDO.setClientIp(IPUtil.getIpAddress(request));
        sysLogDO.setReqUrl(request.getRequestURI());
        sysLogDO.setReturnData(JsonUtil.objectToJson(result));
        sysLogDO.setReqTime(String.valueOf(time));
        sysLogDO.setCreateTime(new Date());
        // 保存系统日志
        sysLogDOMapper.insertSelective(sysLogDO);
        logger.info("保存日志到数据库");
    }

}
