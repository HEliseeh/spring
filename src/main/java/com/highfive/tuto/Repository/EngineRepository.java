package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.highfive.tuto.domain.Engine;
import com.highfive.tuto.domain.Car;

public interface EngineRepository extends JpaRepository<Engine, Long>{

    Optional<Engine> findByName(String Name );

    Optional<Engine> findByType(String type );
    Optional<Engine> findByCar( Car car);
}
