package com.highfive.tuto.web.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highfive.tuto.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerResource {
    
    private final CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }
}