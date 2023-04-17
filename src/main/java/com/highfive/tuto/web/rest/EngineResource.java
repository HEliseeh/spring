package com.highfive.tuto.web.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highfive.tuto.Service.EngineService;

@RestController
@RequestMapping("/engine")
public class EngineResource {
    
    private final EngineService engineService;

    public EngineResource(EngineService engineService) {
        this.engineService = engineService;
    }
}
