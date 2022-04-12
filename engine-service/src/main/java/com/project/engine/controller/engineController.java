package com.project.engine.controller;
import com.project.engine.entity.Engine;
import com.project.engine.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/engine")
public class engineController {

    @Autowired
    private EngineService engineService;

    @PostMapping("/")
    public Engine saveEngine(@RequestBody Engine engine){
        return engineService.saveEngine(engine);
    }

    @GetMapping("/{id}")
    public Optional<Engine> getEngineById(@PathVariable("id") Long orderId){
        return engineService.findEngineById(orderId);
    }


}
