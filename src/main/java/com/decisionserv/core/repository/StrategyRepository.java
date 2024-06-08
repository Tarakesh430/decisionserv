package com.decisionserv.core.repository;

import com.decisionserv.core.entity.Strategy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StrategyRepository extends JpaRepository<Strategy,String> {
    Optional<List<Strategy>> findByIsActive(boolean isActive);
}
