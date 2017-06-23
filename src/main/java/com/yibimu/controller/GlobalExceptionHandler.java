package com.yibimu.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/6/16.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 捕获全局异常
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(){
        HashMap<String, Object> resut = new HashMap<String, Object>();
        resut.put("errorCode", "500");
        resut.put("errorMsg","系统错误");
        resut.put("errorRuntime",RuntimeException.class.getAnnotations());
        return resut;
    }
}
