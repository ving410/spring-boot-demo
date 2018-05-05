package com.totoro.springboot.base.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, Exception e) {

        //打印异常信息：
        e.printStackTrace();
        System.out.print("GlobalDefaultExceptionHandler.defaultErrorHandler()");


    }
}
