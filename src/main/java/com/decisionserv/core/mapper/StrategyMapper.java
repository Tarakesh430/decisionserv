package com.decisionserv.core.mapper;

import com.decisionserv.core.dto.StrategyDto;
import com.decisionserv.core.entity.Strategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StrategyMapper {
    StrategyDto toDto(Strategy strategy);
}
