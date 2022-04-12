package com.project.truck.components;

import com.project.truck.config.MQConfig;
import com.project.truck.externalobjects.Orders;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE_TRUCK)
    public void listener(Orders order){
        System.out.println(order);
    }


}
