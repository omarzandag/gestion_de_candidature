package com.example.gestion_candidature.service.facade;

import com.example.gestion_candidature.entity.User;

public interface UserService {
    User findByFullName(String fullName);
}
