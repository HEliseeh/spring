package com.highfive.tuto.web.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highfive.tuto.Service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandResource {
    private final BrandService brandService;

    public BrandResource(BrandService brandService){
        this.brandService = brandService;
    }
}
