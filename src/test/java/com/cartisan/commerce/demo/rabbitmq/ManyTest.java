package com.cartisan.commerce.demo.rabbitmq;

import com.cartisan.commerce.demo.rabbitmq.many.CartisanSender1;
import com.cartisan.commerce.demo.rabbitmq.many.CartisanSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
    @Autowired
    private CartisanSender1 sender1;

    @Autowired
    private CartisanSender2 sender2;

    @Test
    public void oneToMany() {
        for (int i = 0; i < 100; i++) {
            sender1.send(i);
        }
    }

    @Test
    public void ManyToMany() {
        for (int i = 0; i < 100; i++) {
            sender1.send(i);
            sender2.send(i);
        }
    }
}
