package com.highfive.tuto.web.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highfive.tuto.Service.CarService;

@RestController
@RequestMapping("/car")
public class CarResource {
    
    private final CarService carService;

    public CarResource(CarService carService) {
        this.carService = carService;
    }
}
