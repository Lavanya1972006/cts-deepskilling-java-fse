package com.cognizant.userservice.service;

import com.cognizant.userservice.entity.User;
import com.cognizant.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {


    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    // Create User
    public User saveUser(User user) {

        return userRepository.save(user);

    }


    // Get All Users
    public List<User> getAllUsers(){

        return userRepository.findAll();

    }


    // Get User By Id
    public User getUserById(Long id){

        return userRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("User not found with id : " + id));

    }


    // Delete User
    public void deleteUser(Long id){

        userRepository.deleteById(id);

    }

}