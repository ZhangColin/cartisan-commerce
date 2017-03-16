package com.cartisan.commerce.common;

import lombok.Data;

@Data
public class ErrorInfo<T> {
    private static final Integer OK = 0;
    public static final Integer ERROR = 100;

    private Integer code;
    private String message;
    private String url;
    private T data;
}
