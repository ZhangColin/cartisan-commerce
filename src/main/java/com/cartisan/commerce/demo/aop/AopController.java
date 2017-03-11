package com.cartisan.commerce.demo.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class AopController {
    @Autowired
    AnnotationService annotationService;

    @Autowired
    MethodService methodService;

    @GetMapping("/")
    public void test() {
        annotationService.add();
        methodService.add();
    }
}
