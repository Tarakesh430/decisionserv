package com.decisionserv.core.api;

import com.decisionserv.core.request.DecisionRequest;
import com.decisionserv.core.response.ApiResponse;
import com.decisionserv.core.response.DecisionResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/decision")
public class DecisionResource {

    private static final Logger logger = LoggerFactory.getLogger(DecisionResource.class);

    @PostMapping
    public ResponseEntity<ApiResponse<DecisionResponse>> makeDecision(DecisionRequest decisionRequest){
        return null;
    }
}
