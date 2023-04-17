package com.highfive.tuto.Service;

import org.springframework.stereotype.Service;

import com.highfive.tuto.Repository.CarRepository;
import com.highfive.tuto.domain.Car;


@Service
public class CarService extends CrudService<Car,Long>{
    
        private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        super(carRepository);
        this.carRepository = carRepository;
    }

   

}


