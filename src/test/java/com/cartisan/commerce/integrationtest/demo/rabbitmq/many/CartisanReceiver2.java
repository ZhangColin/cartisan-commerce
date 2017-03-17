package com.cartisan.commerce.integrationtest.demo.rabbitmq.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "cartisan")
public class CartisanReceiver2 {
    @RabbitHandler
    public void process(String cartisan) {
        System.out.println("Receiver 2: "+cartisan);
    }
}
