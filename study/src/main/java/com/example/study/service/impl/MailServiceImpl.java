package com.example.study.service.impl;

import com.example.study.entity.MailEntity;
import com.example.study.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/**
 * @Author:xuelei.wang
 * @create 2020-01-29-11:44
 * @describe
 */
@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public MailEntity send(MailEntity entity) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from); // 邮件发送者
        message.setTo(entity.getUser()); // 邮件接受者
        message.setSubject(entity.getSubject()); // 主题
        message.setText(entity.getContent()); // 内容
        mailSender.send(message);
        return entity;
    }
}
