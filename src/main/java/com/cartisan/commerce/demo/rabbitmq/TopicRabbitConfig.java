package com.cartisan.commerce.demo.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicRabbitConfig {
    final static String message = "topic.message";
    final static String messages = "topic.messages";

    @Bean
    public Queue queueMessage() {
//        // 是否持久化
//        boolean durable = false;
//        // 仅创建者可以使用的私有队列，断开后自动删除
//        boolean exclusive = false;
//        // 当所有消费客户端连接断开后，是否自动删除队列
//        boolean autoDelete = false;
//        Queue queue = new Queue(TopicRabbitConfig.message, durable, exclusive, autoDelete);
        Queue queue = new Queue(TopicRabbitConfig.message);
        return queue;
    }

    @Bean
    public Queue queueMessages() {
        return new Queue(TopicRabbitConfig.messages);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

    @Bean
    public Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.messages");
    }
}
