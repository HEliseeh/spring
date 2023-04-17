package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import com.highfive.tuto.domain.Model;
import com.highfive.tuto.domain.Brand;
public interface ModelRepository extends JpaRepository<Model, Long> {

    boolean existsByNameAndBrand(String Name, Brand brand);

    Optional<Model> findByNameAndBrand(String Name, Brand brand);
    
}
