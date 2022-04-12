package com.project.engine.repository;

import com.project.engine.entity.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepository extends JpaRepository<Engine, Long> {
}
