package com.people.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public void defaultErrorHandler(HttpServletRequest req, HttpServletResponse response ,Exception e)  {
        e.printStackTrace();
        response.setCharacterEncoding("UTF-8");
        try {
            response.getWriter().write(e.toString());
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
