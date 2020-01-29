package com.example.study.controller;

import com.example.study.annotation.ControllerMonitor;
import com.example.study.controller.base.BaseController;
import com.example.study.entity.MailEntity;
import com.example.study.rabbitMQ.Producer;
import com.example.study.rabbitMQ.RabbitConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:xuelei.wang
 * @create 2020-01-29-11:13
 * @describe
 */
@RequestMapping(value = "/user")
@RestController
public class UserController extends BaseController {

    @Autowired
    private Producer producer;

    @ControllerMonitor(value = "发送邮件")
    @PostMapping(value = "/send")
    public Object sendEmail(@RequestBody MailEntity mailEntity) {
        return success("发送成功", producer.send(mailEntity, RabbitConstant.CONTROL_EXCHANGE, RabbitConstant.EMAIL_ROUTING_KEY) );
    }
}
