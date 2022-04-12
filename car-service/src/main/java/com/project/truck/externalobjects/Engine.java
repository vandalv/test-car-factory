package com.project.truck.externalobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine {

    private long idEngine;
    private String fuelType;
    private String powerKw;



}
