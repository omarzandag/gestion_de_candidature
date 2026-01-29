package com.example.gestion_candidature.dao;

import com.example.gestion_candidature.entity.Candidature;
import com.example.gestion_candidature.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatureDao extends JpaRepository<Candidature, Long> {
    Candidature findById(long id);
    List<Candidature> findCandidatureByStatus(String status);
    Candidature findByUserFullName(String userFullName);
    Candidature findByUserEmail(String email);

    List<Candidature> findByStatus(String status);
}
