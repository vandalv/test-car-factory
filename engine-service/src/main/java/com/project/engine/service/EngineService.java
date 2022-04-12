package com.project.engine.service;

import com.project.engine.entity.Engine;
import com.project.engine.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EngineService {

    @Autowired
    private EngineRepository engineRepository;

    public Engine saveEngine(Engine engine) {
        return engineRepository.save(engine);
    }

    public Optional<Engine> findEngineById(Long engineId) {
        return engineRepository.findById(engineId);
    }
}
