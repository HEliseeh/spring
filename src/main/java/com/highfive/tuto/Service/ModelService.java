package com.highfive.tuto.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.highfive.tuto.Repository.BrandRepository;
import com.highfive.tuto.Repository.ModelRepository;
import com.highfive.tuto.domain.Brand;
import com.highfive.tuto.domain.Model;

@Service
public class ModelService extends CrudService<Model, Long>{

    private final ModelRepository modelRepository;
    private final BrandRepository brandRepository;

    public ModelService(
        ModelRepository modelRepository,
        BrandRepository brandRepository
        ) {
        super(modelRepository);
        this.modelRepository = modelRepository;
        this.brandRepository = brandRepository;
    }
    
    @Override
    public Model create(Model model) {
        Optional<Brand> brand=brandRepository.findByName(model.getBrand().getName());
        if(brand.isEmpty()) {
            throw new IllegalArgumentException("Le brand" + model.getBrand().getName() + "n'exist pas " );
        }
        if(modelRepository.existsByNameAndBrand(model.getName(), brand.get())){
            throw new IllegalArgumentException("Model" + model.getName() + "already exists in this " + model.getBrand() );
        }        
        brand.get().getModels().add(model);
        brandRepository.save(brand.get());
        return modelRepository.findByNameAndBrand(model.getName(), brand.get()).get();
    }
}
