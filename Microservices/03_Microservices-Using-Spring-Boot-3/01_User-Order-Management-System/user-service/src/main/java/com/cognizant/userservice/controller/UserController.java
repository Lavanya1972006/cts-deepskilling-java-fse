package com.cognizant.userservice.controller;


import com.cognizant.userservice.entity.User;
import com.cognizant.userservice.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {


    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    // POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user){

        return userService.saveUser(user);

    }


    // GET ALL
    @GetMapping
    public List<User> getAllUsers(){

        return userService.getAllUsers();

    }


    // GET BY ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){

        return userService.getUserById(id);

    }


    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){

        userService.deleteUser(id);

        return "User deleted successfully";

    }

}