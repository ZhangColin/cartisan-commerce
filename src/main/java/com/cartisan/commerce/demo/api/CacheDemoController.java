package com.cartisan.commerce.demo.api;

import com.cartisan.commerce.demo.service.CacheDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache_demo")
public class CacheDemoController {
    @Autowired
    private CacheDemoService demoService;

    @GetMapping("create_date")
    public String create(){
        return demoService.createDate();
    }

    @GetMapping("delete_date")
    public void del(){
        demoService.deleteDate();
    }

    @GetMapping("get_date")
    public String get(){
        return demoService.getDate();
    }
}
