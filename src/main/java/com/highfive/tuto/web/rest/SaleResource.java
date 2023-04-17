package com.highfive.tuto.web.rest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.highfive.tuto.Service.SaleService;


@RestController
@RequestMapping("/sale")
public class SaleResource {
    
    private final SaleService saleService;

    public SaleResource(SaleService saleService){
        this.saleService = saleService;
    }
}
