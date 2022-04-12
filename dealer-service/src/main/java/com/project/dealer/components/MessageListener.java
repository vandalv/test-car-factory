package com.project.dealer.components;

import com.project.dealer.config.MQConfig;
import com.project.dealer.helpers.AssembledTemplate;
import com.project.dealer.helpers.Engine;
import com.project.dealer.helpers.OrderResponse;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE_HOME)
    public void listener(OrderResponse orderResponse){
        System.out.println("Hey! I`m your Order. Your price is - " + orderResponse.getPrice());
    }
}
