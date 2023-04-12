package com.highfive.tuto.Service;

import com.highfive.tuto.Repository.CarRepository;
import com.highfive.tuto.domain.Car;
import com.highfive.tuto.domain.Model;

import java.util.List;
import java.util.Optional;


public class CarService extends CrudService<Car,Long>{
    
        private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        super(carRepository);
        this.carRepository = carRepository;
    }

    @Override
    public Car create(Car car) {
       return super.create(car);
    }
    public List<Car> getAll() {
        return super.getAll();
    }
    public Optional<Car> getByModel(Model model) {return carRepository.findByModel(model);}

    public Optional<Car> getByPrice(int price) {return carRepository.findByPrice(price);}

}


