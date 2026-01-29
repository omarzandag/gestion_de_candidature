package com.example.gestion_candidature.dao;

import com.example.gestion_candidature.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByFullName(String fullName);
    User findByFirstName(String firstName);
    User findByLastName(String lastName);
}
