package com.cartisan.commerce.demo.rabbitmq;

import com.cartisan.commerce.demo.rabbitmq.object.ObjectSender;
import com.cartisan.commerce.demo.rabbitmq.object.RabbitUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectTest {
    @Autowired
    private ObjectSender objectSender;

    @Test
    public void sendObject() {
        RabbitUser user = new RabbitUser();
        user.setName("colin");
        user.setPass("123456");
        objectSender.send(user);
    }
}
