package com.example.study.annotation;

import java.lang.annotation.*;

/**
 * @Author:xuelei.wang
 * @create 2020-01-29-13:50
 * @describe AOP注解
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ControllerMonitor {
    String value() default "";
}
