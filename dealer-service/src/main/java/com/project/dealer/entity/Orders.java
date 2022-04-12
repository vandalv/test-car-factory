package com.project.dealer.entity;
import com.project.dealer.helpers.ContractingAuthority;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long orderId;
    private Boolean truck;
    private String body;
    private String engine;
    private String equipment;

}
