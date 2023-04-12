package com.highfive.tuto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import com.highfive.tuto.domain.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
    

    Optional<Customer> findByName(String Name);

    Optional<Customer> findByAddress(String address);

    Optional<Customer> findByPhone(String phone);

}
