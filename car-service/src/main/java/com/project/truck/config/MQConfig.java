package com.project.truck.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {

    public static final String QUEUE_TRUCK = "message_queue_truck";
    public static final String QUEUE_CAR = "message_queue_car";
    public static final String EXCHANGE = "message_exchange";
    public static final String ROUTING_KEY_TRUCK = "message_routingKey_truck";
    public static final String ROUTING_KEY_CAR = "message_routingKey_car";

    public static final String QUEUE_HOME = "send_order_back";
    public static final String EXCHANGE_BACK = "back_exchange";
    public static final String ROUTING_KEY_RETURN_ORDER = "back_route";


    @Bean
    public Queue queueHome(){
        return  new Queue(QUEUE_HOME);
    }

    @Bean
    public TopicExchange exchangeBack(){
        return new TopicExchange(EXCHANGE_BACK);
    }


    @Bean
    public Queue queueTruck(){
        return  new Queue(QUEUE_TRUCK);
    }

    @Bean
    public Queue queueCar(){
        return  new Queue(QUEUE_CAR);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding bindingTruck(Queue queueTruck, TopicExchange exchange){
        return BindingBuilder
                .bind(queueTruck)
                .to(exchange)
                .with(ROUTING_KEY_TRUCK);
    }

    @Bean
    public Binding bindingCar(Queue queueCar, TopicExchange exchange){
        return BindingBuilder
                .bind(queueCar)
                .to(exchange)
                .with(ROUTING_KEY_CAR);
    }

    @Bean
    public Binding bindingBack(Queue queueHome, TopicExchange exchangeBack){
        return BindingBuilder
                .bind(queueHome)
                .to(exchangeBack)
                .with(ROUTING_KEY_RETURN_ORDER);
    }

    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public AmqpTemplate template(ConnectionFactory connectionFactory){
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMessageConverter(messageConverter());
        return template;
    }
}
