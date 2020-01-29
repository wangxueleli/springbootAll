package com.example.study.utils;

import org.springframework.http.ResponseEntity;


/**
 * @Author:xuelei.wang
 * @create 2020-01-29-12:20
 * @describe
 */
public class ResponseResult {
    private String code;
    private String message;
    private Object result;

    public ResponseResult(String code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public static ResponseEntity success(String code, String message, Object result) {
        return ResponseEntity.ok(new ResponseResult(code, message, result));
    }

    public static ResponseEntity faild(String code, String message, Object result) {
        return ResponseEntity.ok(new ResponseResult(code, message, result));
    }

}
