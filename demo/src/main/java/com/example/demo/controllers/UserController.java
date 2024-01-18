package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.CrmDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.models.Crm;
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

    // public String saveUser(UserDto userDto) {
    // User newUser = new User();
    // newUser.setPassword(userDto.getPassword());
    // newUser.setUsername(userDto.getUsername());

    // // Insert User
    // userRepo.save(newUser);

    // if (userDto.getCrms() != null) {
    // for (CrmDto crmDto : userDto.getCrms()) {
    // Crm newCrm = new Crm();
    // newCrm.setTitle(CrmDto.getTitle())getStartDate());
    // newSchedule.setEndDate(scheduleDto.getEndDate());
    // newSchedule.setShift(scheduleDto.getShift());
    // newSchedule.setNotes(scheduleDto.getNotes());
    // newSchedule.setUser(newUser); // Thiết lập mối quan hệ với User
    // scheduleRepo.save(newSchedule);
    // }
    // }

    // return "saved...";
    // }

}
