package com.cartisan.commerce.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import static com.cartisan.commerce.common.controller.Urls.SIGNIN;

@Controller
public class SignController {
    @GetMapping(SIGNIN)
    public String signin() {
        return SIGNIN;
    }


}
