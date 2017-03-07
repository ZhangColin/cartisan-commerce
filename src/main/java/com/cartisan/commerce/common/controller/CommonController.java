package com.cartisan.commerce.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.cartisan.commerce.common.controller.Urls.COMMON;
import static com.cartisan.commerce.common.controller.Urls.INTERNALSERVERERROR;
import static com.cartisan.commerce.common.controller.Urls.NOTFOUND;

@Controller
@RequestMapping(COMMON)
public class CommonController {
    @GetMapping(NOTFOUND)
    public String notFoundError() {
        return NOTFOUND;
    }

    @GetMapping(INTERNALSERVERERROR)
    public String internalServerError() {
        return INTERNALSERVERERROR;
    }
}
