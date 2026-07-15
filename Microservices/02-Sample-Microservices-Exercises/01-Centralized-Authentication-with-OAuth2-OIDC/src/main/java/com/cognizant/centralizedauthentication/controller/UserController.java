package com.cognizant.centralizedauthentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/public")
    public String publicAccess() {
        return "This is a public endpoint";
    }

    @GetMapping("/user")
    public String userAccess() {
        return "Welcome User! You are authenticated";
    }

    @GetMapping("/admin")
    public String adminAccess() {
        return "Welcome Admin! You have admin access";
    }
}