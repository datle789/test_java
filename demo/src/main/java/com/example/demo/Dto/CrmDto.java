package com.example.demo.Dto;

import com.example.demo.models.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class CrmDto {
    private long id;

    private String title;

    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
