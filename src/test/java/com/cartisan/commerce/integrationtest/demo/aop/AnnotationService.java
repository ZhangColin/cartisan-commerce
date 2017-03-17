package com.cartisan.commerce.integrationtest.demo.aop;

import com.cartisan.commerce.common.aop.Action;
import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
    @Action(name="AnnotationService.add")
    public void add(){}
}
