package com.highfive.tuto.Service;

import java.util.List;

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
       return super.create(customer);
    }
    public List<Customer> getAll() {
        return super.getAll();
    }

}
