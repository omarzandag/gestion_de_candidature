package com.example.gestion_candidature.service.Impl;

import com.example.gestion_candidature.dao.UserDao;
import com.example.gestion_candidature.entity.User;
import com.example.gestion_candidature.service.facade.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findByFullName(String fullName) {
        return dao.findByFullName(fullName);
    }

    private UserDao dao;
}
