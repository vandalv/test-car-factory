package com.project.truck.service;

import com.project.truck.config.MQConfig;
import com.project.truck.externalobjects.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ReadyCarService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RabbitTemplate template;

    public AssembledTemplate getOrderFromOtherMicroservice(Long orderId){
        AssembledTemplate at = new AssembledTemplate();
        Orders orders = restTemplate.getForObject("http://CAR-ORDER-SERVICE/order/" + orderId, Orders.class);
        at.setOrders(orders);
        Body body = restTemplate.getForObject("http://BODY-FACTORY-SERVICE/body/" + orderId, Body.class);
        at.setBody(body);
        Engine engine = restTemplate.getForObject("http://ENGINE-FACTORY-SERVICE/engine/" + orderId, Engine.class);
        at.setEngine(engine);
        for (int i = 0; i < 4; i++){
            Equipment equipment = restTemplate.getForObject("http://EQUIPMENT-FACTORY-SERVICE/equipment/", Equipment.class);
            at.getAdditionalEquipment().add(equipment);
        }
        OrderResponse orderResponse = new OrderResponse(987456L, 10000);
        template.convertAndSend(MQConfig.EXCHANGE_BACK, MQConfig.ROUTING_KEY_RETURN_ORDER, orderResponse);
        System.out.println(at);
        return at;
    }
}
