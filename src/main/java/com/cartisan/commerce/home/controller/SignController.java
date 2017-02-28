package com.cartisan.commerce.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {
    @GetMapping("/signin")
    public String signin() {
        return "/signin";
    }
}
