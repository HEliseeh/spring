package com.highfive.tuto.Service;

import java.util.List;
import java.util.Optional;

import com.highfive.tuto.Repository.EngineRepository;
import com.highfive.tuto.domain.Engine;

public class EngineService extends CrudService<Engine, Long>{
    
    private final EngineRepository engineRepository;

    public EngineService(EngineRepository engineRepository) {
        super(engineRepository);
        this.engineRepository = engineRepository;
    }

    @Override
    public Engine create(Engine engine) {
        if(engineRepository.existsByNameAndType(engine.getName(), engine.getType())){
            throw new IllegalArgumentException("Ce moteur exist déjà ");
        }
        return super.create(engine);
     }
   

     public Optional<Engine> getByName(String name) {return engineRepository.findByName(name);}
     
    
}
