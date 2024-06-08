package com.decisionserv.core.dto;

import com.decisionserv.core.enums.RuleType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StrategyDto {
    @JsonProperty("strategy_name")
    private String strategyName;
    @JsonProperty("strategy_type")
    private RuleType type;
    @JsonProperty("avg_executed_time")
    private long avgExecutedTime;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("is_active")
    private boolean isActive;
    @JsonProperty("create_time")
    private long createTime;
    @JsonProperty("update_time")
    private long updateTime;
}
