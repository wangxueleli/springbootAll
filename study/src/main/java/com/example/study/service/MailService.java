package com.example.study.service;

import com.example.study.entity.MailEntity;

/**
 * @Author:xuelei.wang
 * @create 2020-01-29-11:41
 * @describe
 */
public interface MailService {
    MailEntity send(MailEntity entity);
}
