package com.highfive.tuto.Service;

import java.util.List;
import java.util.Optional;

import com.highfive.tuto.Repository.FeatureRepository;
import com.highfive.tuto.domain.Feature;

public class FeatureService extends CrudService<Feature, Long>{

    private final FeatureRepository featureRepository;

    public FeatureService(FeatureRepository featureRepository) {
        super(featureRepository);
        this.featureRepository = featureRepository;
    }

    @Override
    public Feature create(Feature feature) {
        if(featureRepository.existsByName(feature.getName())){
            throw new IllegalArgumentException("Cette option existe déjà ");
        }
        return super.create(feature);
     }

     public List<Feature> getAll() {
        return super.getAll();
    }



     
}
