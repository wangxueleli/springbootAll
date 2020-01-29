package com.example.study.entity;

import java.io.Serializable;

/**
 * @Author:xuelei.wang
 * @create 2020-01-29-11:43
 * @describe
 */
public class MailEntity implements Serializable {
    private static final long serialVersionUID = 3062479058855881261L;
    private String user;
    private String content;
    private String subject;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
