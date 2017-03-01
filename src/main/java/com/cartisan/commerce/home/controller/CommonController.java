package com.cartisan.commerce.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class CommonController {
    @GetMapping("/404")
    public String notFoundError() {
        return "/notFoundError";
    }

    @GetMapping("/500")
    public String internalServerError() {
        return "/internalServerError";
    }
}
