package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.highfive.tuto.domain.Car;
import com.highfive.tuto.domain.Model;


public interface CarRepository  extends JpaRepository<Car, Long>{
    

    Optional<Car> findByModel( Model model);

    Optional<Car> findByPrice( int price);

    
}
