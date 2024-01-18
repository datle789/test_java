package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.repos.UserRepo;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public List<User> getUser() {
        return userRepo.findAll();
    }
}
