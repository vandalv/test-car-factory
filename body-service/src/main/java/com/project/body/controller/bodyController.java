package com.project.body.controller;

import com.project.body.entity.Body;
import com.project.body.service.BodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/body")
public class bodyController {

    @Autowired
    private BodyService bodyService;

    @PostMapping("/")
    public Body saveBody(@RequestBody Body body){
        return bodyService.saveBody(body);
    }

    @GetMapping("/{id}")
    public Optional<Body> getBodyById(@PathVariable("id") Long orderId){
        return bodyService.findBodyById(orderId);
    }


}
