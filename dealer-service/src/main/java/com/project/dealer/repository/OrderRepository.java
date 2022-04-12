package com.project.dealer.repository;

import com.project.dealer.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {
    Orders findByOrderId(Long orderId);
}
