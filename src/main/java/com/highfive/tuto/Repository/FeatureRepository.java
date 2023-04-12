package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.highfive.tuto.domain.Feature;
import com.highfive.tuto.domain.Car;

public interface FeatureRepository extends JpaRepository<Feature, Long>{

    Optional<Feature> findByName(String Name );

    Optional<Feature> findByCar( Car car);
    
}
