package com.highfive.tuto.web.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highfive.tuto.Service.ModelService;

@RestController
@RequestMapping("/model")
public class ModelResource {
    
    private final ModelService modelService;

    public ModelResource(ModelService modelService) {
        this.modelService = modelService;
    }
}
