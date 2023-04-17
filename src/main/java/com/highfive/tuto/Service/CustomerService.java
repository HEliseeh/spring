package com.highfive.tuto.Service;

import java.util.List;
import java.util.Optional;

import com.highfive.tuto.Repository.CustomerRepository;
import com.highfive.tuto.domain.Customer;

public class CustomerService extends CrudService<Customer, Long>{
    
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer create(Customer customer) {
        if(customerRepository.existsByPhone(customer.getPhone())){
            throw new IllegalArgumentException("customer" + customer.getName() + "already exists in this ");
        }
       return super.create(customer);
    }
    public List<Customer> getAll() {
        
        return super.getAll();
    }

    public Optional<Customer> getByName(String name) {return customerRepository.findByName(name);}
    
    
    public Optional<Customer> getByPhone(String phone) {return customerRepository.findByPhone(phone);}
    
}
