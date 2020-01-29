package com.example.study.rabbitMQ;

import com.example.study.entity.MailEntity;
import com.example.study.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:xuelei.wang
 * @create 2020-01-29-13:11
 * @describe
 */
@Component
public class Consumer {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Autowired
    private MailService mailService;

    @RabbitListener(queues = RabbitConstant.EMAIL_QUEUE)
    public void processEmail(MailEntity mailEntity) {
        try {
            logger.info("准备开始发邮件...." + mailEntity.getUser());
            mailService.send(mailEntity);
            logger.info("发送成功..." + mailEntity.getUser());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("邮件发送失败了！");
        }
    }
}
