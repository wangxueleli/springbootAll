package com.example.study.enums;

/**
 * @Author:xuelei.wang
 * @create 2020-01-22-9:57
 * @describe
 */
public enum StatusEnum {

    SUCCESS("60001", "SUCCESS"),
    FAIL("60002", "FAIL");
    String code;
    String msg;

    StatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}


