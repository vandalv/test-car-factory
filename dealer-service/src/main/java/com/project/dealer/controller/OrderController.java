package com.project.dealer.controller;
import com.project.dealer.config.MQConfig;
import com.project.dealer.entity.Orders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.dealer.service.OrderService;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/")
    public Orders saveOrder(@RequestBody Orders order){
        log.info("Class: OrderController --- Method: saveOrder");
        if(order.getTruck()){
            template.convertAndSend(MQConfig.EXCHANGE, MQConfig.ROUTING_KEY_TRUCK, order);
        }
        if(!order.getTruck()){
            template.convertAndSend(MQConfig.EXCHANGE, MQConfig.ROUTING_KEY_CAR, order);
        }
        return orderService.saveOrder(order);
    }

    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable("id") Long orderId){
        log.info("Class: OrderController --- Method: getOrderById");
        return orderService.getOrderById(orderId);
    }
}
