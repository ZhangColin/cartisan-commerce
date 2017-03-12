package com.cartisan.commerce;

import com.cartisan.commerce.account.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@ContextConfiguration(classes = Application.class)
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        stringRedisTemplate.opsForValue().set("aaa", "111");
        assertThat(stringRedisTemplate.opsForValue().get("aaa")).isEqualTo("111");
    }

    @Test
    public void testObj() throws InterruptedException {
        Account account = new Account();
        account.setEmail("stwyhm@126.com");
        account.setUserName("colin");
        account.setPassword("aaa123456");
        account.setNickName("文野");

        ValueOperations<String, Account> operations = redisTemplate.opsForValue();
        operations.set("com.cartisan.commerce.account", account);
        operations.set("com.cartisan.commerce.account.f", account, 1, TimeUnit.SECONDS);
        Thread.sleep(1000);

        assertThat(redisTemplate.hasKey("com.cartisan.commerce.account.f")).isFalse();
    }
}
