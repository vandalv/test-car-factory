package com.project.truck.externalobjects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Equipment {

    private long idEquipment;
    private String name;

}