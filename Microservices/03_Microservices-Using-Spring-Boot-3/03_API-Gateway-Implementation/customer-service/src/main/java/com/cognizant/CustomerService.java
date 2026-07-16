package com.cognizant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer getCustomer(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }

}