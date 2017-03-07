package com.cartisan.commerce;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static com.cartisan.commerce.common.controller.Urls.INTERNALSERVERERROR;

@ControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(Exception.class)
    public String internalServerError() {
        return INTERNALSERVERERROR;
    }

}
