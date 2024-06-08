package com.decisionserv.core.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

@Getter
public enum RuleType {
    JAVA_RULE("JAVA"),
    ML_MODEL_RULE("ML");
    private final String value;

    RuleType(String value) {
        this.value = value;
    }

    public static RuleType fromString(String ruleType) {
        return Arrays.stream(RuleType.values())
                .filter(s -> s.getValue().equalsIgnoreCase(ruleType)).findFirst().orElse(null);
    }

    public static boolean in(String ruleType) {
        return Objects.nonNull(fromString(ruleType));
    }
}

