package com.project.body.service;

import com.project.body.entity.Body;
import com.project.body.repository.BodyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BodyService {

    @Autowired
    private BodyRepository bodyRepository;

    public Body saveBody(Body body) {
        return bodyRepository.save(body);
    }

    public Optional<Body> findBodyById(Long orderId) {
        return bodyRepository.findById(orderId);
    }
}
