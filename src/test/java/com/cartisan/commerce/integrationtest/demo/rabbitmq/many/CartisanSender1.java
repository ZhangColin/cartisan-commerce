package com.cartisan.commerce.integrationtest.demo.rabbitmq.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartisanSender1 {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "cartisan queue ******** "+i;
        System.out.println("Sender1: "+context);
        rabbitTemplate.convertAndSend("cartisan", context);
    }
}
