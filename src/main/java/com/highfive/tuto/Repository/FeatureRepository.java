package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.highfive.tuto.domain.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Long>{

    boolean existsByName(String name);
    Optional<Feature> findByName(String Name );


    
}
