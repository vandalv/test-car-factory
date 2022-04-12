package com.project.truck.externalobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {
    private Long id;
    private int price;
}
