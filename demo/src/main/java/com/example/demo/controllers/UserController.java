package com.example.demo.controllers;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.CrmDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.models.Crm;
import com.example.demo.models.User;
import com.example.demo.repos.CrmRepo;
import com.example.demo.repos.UserRepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CrmRepo crmRepo;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping(value = "/")
    public List<User> getUser() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/create")
    public String saveUser(@RequestBody UserDto userDto) {
        User newUser = new User();
        newUser.setPassword(userDto.getPassword());
        newUser.setUsername(userDto.getUsername());

        // Insert User
        userRepo.save(newUser);

        if (userDto.getCrms() != null) {
            // for (CrmDto crmDto : userDto.getCrms()) {
            // Crm newCrm = new Crm();
            // newCrm.setTitle(crmDto.getTitle());
            // newCrm.setUser(newUser); // Thiết lập mối quan hệ với User
            // crmRepo.save(newCrm);

            // }

            // logger.info("result: {}", userDto.getCrms().size());

            for (int i = 0; i < userDto.getCrms().size(); i++) {
                // logger.info("result: {}", userDto.getCrms().get(i));
                Crm newCrm = new Crm();
                newCrm.setTitle(userDto.getCrms().get(i).getTitle());
                newCrm.setUser(newUser);
                crmRepo.save(newCrm);
            }

        }

        // logger.info("result: {}", userDto.getCrms());

        return "saved...";
    }

}
