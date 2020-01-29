package com.example.study.rabbitMQ;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;


/**
 * @Author:xuelei.wang
 * @create 2020-01-29-12:38
 * @describe
 */
public class TopicExchageConfig {
    /**
     * 声明队列
     *
     * @return
     */
    @Bean
    public Queue emailQueue() {
        return new Queue(RabbitConstant.EMAIL_QUEUE, true);//true表示持久化该队列
    }

    /**
     * 声明交换机
     *
     * @return
     */
    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(RabbitConstant.CONTROL_EXCHANGE);
    }

    /**
     * 绑定
     *
     * @return
     */
    @Bean
    public Binding bindingEmail() {
        return BindingBuilder.bind(emailQueue()).to(topicExchange()).with(RabbitConstant.EMAIL_ROUTING_KEY);//*表示一个词,#表示零个或多个词
    }

}
