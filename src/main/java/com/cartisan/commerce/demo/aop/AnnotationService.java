package com.cartisan.commerce.demo.aop;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
    @Action(name="AnnotationService.add")
    public void add(){}
}
