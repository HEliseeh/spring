package com.highfive.tuto.Service;


import com.highfive.tuto.Repository.BrandRepository;
import com.highfive.tuto.domain.Brand;
import org.springframework.stereotype.Service;
import java.util.Optional;

public  class BrandService extends CrudService<Brand, Long> {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        super(brandRepository);
        this.brandRepository = brandRepository;
    }
    
    @Override
    public Brand create(Brand brand) {
        if(brandRepository.existsByName(brand.getName())){
            throw new IllegalArgumentException("Brand" + brand.getName() + "already exists");
        }
        return super.create(brand);
    }

    public Optional <Brand> get(String name) {
        return brandRepository.findByName(name);
    }
}
