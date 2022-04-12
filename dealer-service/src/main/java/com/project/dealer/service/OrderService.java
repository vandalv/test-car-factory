package com.project.dealer.service;

import com.project.dealer.entity.Orders;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.dealer.repository.OrderRepository;

@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Orders saveOrder(Orders order) {
        log.info("Class: OrderService --- Method: saveOrder");
        return orderRepository.save(order);
    }

    public Orders getOrderById(Long orderId) {
        log.info("Class: OrderService --- Method: getOrderById");
        return orderRepository.findByOrderId(orderId);
    }
}
