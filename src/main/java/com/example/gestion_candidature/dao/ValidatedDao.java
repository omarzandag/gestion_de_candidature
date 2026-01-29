package com.example.gestion_candidature.dao;

import com.example.gestion_candidature.entity.User;
import com.example.gestion_candidature.entity.Validated;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidatedDao extends JpaRepository<Validated, Long> {
    Validated findByName(String name);
}
