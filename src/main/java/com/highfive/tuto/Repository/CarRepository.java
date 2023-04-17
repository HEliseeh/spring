package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.highfive.tuto.domain.Car;


public interface CarRepository  extends JpaRepository<Car, Long>{
    

    // Optional<Car> findByModel( Model model);

    // Optional<Car> findByPrice( int price);

    
}
