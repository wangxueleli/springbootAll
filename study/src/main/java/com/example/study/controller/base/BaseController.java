package com.example.study.controller.base;

import com.example.study.enums.StatusEnum;
import com.example.study.utils.ResponseResult;

/**
 * @Author:xuelei.wang
 * @create 2020-01-29-12:26
 * @describe
 */
public class BaseController {
    protected Object success(String message) {
        return success(message, null);
    }

    protected Object success(Object result) {
        return success(null, result);
    }

    protected Object success(String message, Object result) {
        return ResponseResult.success(StatusEnum.SUCCESS.getCode(), message, result);
    }

    protected Object fail(Object result) {
        return fail(null, result);
    }

    protected Object fail(String message, Object result) {
        return ResponseResult.faild(StatusEnum.FAIL.getCode(), message, result);
    }
}
