package com.guames.microservices.limitsservice.controllers;

import com.guames.microservices.limitsservice.components.Configuration;
import com.guames.microservices.limitsservice.protocols.LimitsConfigurationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("limits")
    public LimitsConfigurationResponse retrieveLimitsFromConfigurations(){
        return new LimitsConfigurationResponse(configuration.getMinimum(), configuration.getMaximum());
    }
}
