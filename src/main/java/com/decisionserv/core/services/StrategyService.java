package com.decisionserv.core.services;

import com.decisionserv.core.dto.StrategyDto;
import com.decisionserv.core.entity.Strategy;
import com.decisionserv.core.mapper.StrategyMapper;
import com.decisionserv.core.repository.StrategyRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StrategyService {
    private final Logger logger = LoggerFactory.getLogger(StrategyService.class);
    private final StrategyRepository strategyRepository;
    private final StrategyMapper strategyMapper;
    public List<StrategyDto> getActiveStrategies() throws Exception {
        logger.info("Get Active Strategies");
        List<Strategy> strategyList = strategyRepository.findByIsActive(true)
                .orElseThrow(() -> new Exception("Exception in getting Active Strategies"));
        return strategyList.stream().map(strategyMapper::toDto).collect(Collectors.toList());
    }
}
