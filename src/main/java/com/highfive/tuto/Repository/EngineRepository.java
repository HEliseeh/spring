package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.highfive.tuto.domain.Engine;
import com.highfive.tuto.domain.enums.EngineType;

public interface EngineRepository extends JpaRepository<Engine, Long>{

    boolean existsByNameAndType(String name, EngineType type);
    Optional<Engine> findByName(String Name );
    
}
