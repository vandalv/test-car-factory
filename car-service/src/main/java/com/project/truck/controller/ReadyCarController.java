package com.project.truck.controller;

import com.project.truck.externalobjects.AssembledTemplate;
import com.project.truck.service.ReadyCarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readycar")
@Slf4j
public class ReadyCarController {

    @Autowired
    private ReadyCarService readyCarService;

    @GetMapping("/{id}")
    public AssembledTemplate getDataFromOrdersMicroservice(@PathVariable("id") long orderId){
        return readyCarService.getOrderFromOtherMicroservice(orderId);
    }
}
