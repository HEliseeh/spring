package com.highfive.tuto.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.highfive.tuto.Repository.SaleRepository;
import com.highfive.tuto.domain.Sale;

@Service
public class SaleService extends CrudService<Sale, Long> {
    
    private final SaleRepository  saleRepository;

    public SaleService(SaleRepository saleRepository) {
        super(saleRepository);
        this.saleRepository = saleRepository;
    }

    @Override
    public Sale create(Sale sale) {
        
        return super.create(sale);
     }

     public List<Sale> getAll() {
        return super.getAll();
    }
 
    }

