package com.cartisan.commerce.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.cartisan.commerce.common.controller.Urls.HOME;
import static com.cartisan.commerce.common.controller.Urls.ROOT;

@Controller
@RequestMapping(ROOT)
public class HomeController {
    @GetMapping
    public String index() throws Exception {
        return HOME;
    }
}
