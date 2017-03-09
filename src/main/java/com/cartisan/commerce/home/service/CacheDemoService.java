package com.cartisan.commerce.home.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CacheDemoService {
    @CachePut(value = "SystemDate")
    public String createDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    @CacheEvict(value = "SystemDate")
    public void deleteDate() {

    }

    @Cacheable(value="SystemDate")
    public String getDate() {
        return "";
    }
}
