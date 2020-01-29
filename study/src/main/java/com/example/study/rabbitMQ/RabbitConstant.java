package com.example.study.rabbitMQ;

/**
 * @Author:xuelei.wang
 * @create 2020-01-20-17:49
 * @describe
 */
public class RabbitConstant {

    /**
     * 邮件队列
     */
    public static final String EMAIL_QUEUE = "email";

    /**
     * 邮件队列路由键（*表示一个词,#表示零个或多个词）
     */
    public static final String EMAIL_ROUTING_KEY = "email.key";

    /**
     * 交换机
     */
    public static final String CONTROL_EXCHANGE = "control.exchange";
}
