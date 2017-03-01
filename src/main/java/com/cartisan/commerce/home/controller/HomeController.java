package com.cartisan.commerce.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String index() {
        return "/home";
    }


    @GetMapping("/throwError")
    public String throwError() throws Exception {
        throw new Exception("error");
    }


}
