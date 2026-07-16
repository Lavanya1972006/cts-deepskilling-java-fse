package com.cognizant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping
    public List<Product> getProducts() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return service.getById(id);
    }
}