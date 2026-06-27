package com.example;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable Long id) {

        if (id == 1) {
            return "John";
        }

        throw new NoSuchElementException();
    }
}