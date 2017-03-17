package com.cartisan.commerce.integrationtest.demo.rabbitmq.object;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(RabbitUser user) {
        System.out.println("Sender object: "+user);
        rabbitTemplate.convertAndSend("object", user);
    }

}
