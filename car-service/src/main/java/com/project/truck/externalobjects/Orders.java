package com.project.truck.externalobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    private long orderId;
    private Boolean truck;
    private String body;
    private String engine;
    private String equipment;
}
