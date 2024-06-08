package com.decisionserv.core.api;

import com.decisionserv.core.dto.StrategyDto;
import com.decisionserv.core.response.ApiResponse;
import com.decisionserv.core.services.StrategyService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/decision/strategy")
public class StrategyResource {

    private final Logger logger = LoggerFactory.getLogger(StrategyResource.class);
    private final StrategyService strategyService;

    @GetMapping
    public ResponseEntity<ApiResponse<List<StrategyDto>>> getActiveStrategies() throws Exception {
       logger.info("GET:: ACTIVE STRATEGIES :: LIST ");
       return ResponseEntity.ok(ApiResponse.success("Retrieved Available Active Strategies",
               strategyService.getActiveStrategies()));
    }
}
