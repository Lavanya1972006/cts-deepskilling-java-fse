package com.cognizant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.saveCustomer(customer);
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return service.getCustomer(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        service.deleteCustomer(id);
        return "Customer Deleted Successfully";
    }
}