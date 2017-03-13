package com.cartisan.commerce.demo.rabbitmq.object;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {
    @RabbitHandler
    public void process(RabbitUser user) {
        System.out.println("Receiver object: "+user);
    }
}
