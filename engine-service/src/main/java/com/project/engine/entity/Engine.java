package com.project.engine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEngine;
    private String fuelType;
    private String powerKw;



}

