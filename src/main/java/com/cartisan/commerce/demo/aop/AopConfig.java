package com.cartisan.commerce.demo.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.cartisan.commerce.demo.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
