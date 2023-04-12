package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import com.highfive.tuto.domain.Brand;
public interface BrandRepository extends JpaRepository<Brand, Long> {

    boolean existsByName(String Name);

    Optional<Brand> findByName(String Name);
    
}
