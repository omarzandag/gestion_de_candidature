package com.example.gestion_candidature.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Candidature {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime date;
    @OneToOne
    private User user;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
