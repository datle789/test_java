package com.example.demo.Dto;

import java.util.List;

import com.example.demo.models.Crm;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class UserDto {
    private long id;

    private String username;

    private String password;

    private List<Crm> Crms;

    public List<Crm> getCrms() {
        return Crms;
    }

    public void setCrms(List<Crm> crms) {
        Crms = crms;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
