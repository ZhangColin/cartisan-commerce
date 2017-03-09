package com.cartisan.commerce.home.repository;

import com.cartisan.commerce.home.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class CustomerRepository {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    ValueOperations<String, String> valOpsStr;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Resource(name = "redisTemplate")
    ValueOperations<Object, Object> valOps;

    public void stringRedisTemplateDemo() {
        valOpsStr.set("xx", "yy");
    }

    public void save(Customer customer) {
        valOps.set(customer.getId(), customer);
    }

    public String getString() {
        return valOpsStr.get("xx");
    }

    public Customer getCustomer() {
        return (Customer) valOps.get("1");
    }
}
