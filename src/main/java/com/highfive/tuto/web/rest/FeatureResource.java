package com.highfive.tuto.web.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highfive.tuto.Service.FeatureService;

@RestController
@RequestMapping("/feature")
public class FeatureResource {
    
    private final FeatureService featureService;

    public FeatureResource(FeatureService featureService) {
        this.featureService = featureService;
    }
}