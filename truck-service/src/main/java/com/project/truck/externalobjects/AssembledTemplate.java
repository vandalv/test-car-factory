package com.project.truck.externalobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssembledTemplate {

    private Orders orders;
    private Body body;
    private Engine engine;
    private List<Equipment> additionalEquipment = new ArrayList<>();
}
