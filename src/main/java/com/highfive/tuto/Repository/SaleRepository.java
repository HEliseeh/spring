package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.highfive.tuto.domain.Sale;
import com.highfive.tuto.domain.Car;
import com.highfive.tuto.domain.Customer;
public interface SaleRepository extends JpaRepository<Sale, Long>{

    Optional<Sale> findByCar( Car car);

    Optional<Sale> findByCustomer(Customer customer);

    Optional<Sale> findByCreated(int date);

    Optional<Sale> findByCreated_by(String created_by);

    Optional<Sale> findByPrice(int price);


    Optional<Sale> findByNameByCarByCustomer(String Name, Car car, Customer customer);
    
    
}
