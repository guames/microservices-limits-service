package com.guames.microservices.limitsservice.protocols;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LimitsConfigurationResponse {
    private int minimum;
    private int maximum;
}
