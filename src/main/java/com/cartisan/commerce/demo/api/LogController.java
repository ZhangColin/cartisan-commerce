package com.cartisan.commerce.demo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public void Log() {
        LOG.error("logger logger logger logger logger logger logger ");
    }
}
