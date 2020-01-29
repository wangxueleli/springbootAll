package com.example.study.rabbitMQ;

import com.example.study.entity.MailEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * @Author:xuelei.wang
 * @create 2020-01-29-12:56
 * @describe
 */
@Component
public class Producer {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private RabbitTemplate template;

    public MailEntity send(MailEntity entity, String exchange, String routingKey) {
        template.convertAndSend(exchange, routingKey, entity);
        logger.info("rabbitmq消息已经发送到交换机, 等待交换机接受..." + entity.getUser());
        return entity;
    }
}
