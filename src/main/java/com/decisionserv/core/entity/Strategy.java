package com.decisionserv.core.entity;

import com.decisionserv.core.enums.RuleType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "strategy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Strategy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "strategy_id", unique = true, nullable = false)
    private String strategyId;
    @Column(name = "strategy_name", unique = true, nullable = false)
    private String strategyName;
    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private RuleType type;
    @Column(name = "avg_executed_time",nullable = false)
    private long avgExecutedTime;
    @Column(name = "created_by", nullable = false)
    private String createdBy;
    @Column(name = "is_active", nullable = false)
    private boolean isActive;
    @Column(name = "create_time", nullable = false)
    private long createTime;
    @Column(name = "update_time", nullable = false)
    private long updateTime;
}
