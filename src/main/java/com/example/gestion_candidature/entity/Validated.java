package com.example.gestion_candidature.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Validated {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate date;
    @OneToMany
    private List<User> usersValidated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<User> getValidatedUsers() {
        return validatedUsers;
    }

    public void setValidatedUsers(List<User> validatedUsers) {
        this.validatedUsers = validatedUsers;
    }

    @OneToMany
    private List<User> validatedUsers;


}
