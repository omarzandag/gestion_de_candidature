package com.example.gestion_candidature.dao;

import com.example.gestion_candidature.entity.Candidature;
import com.example.gestion_candidature.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatureDao extends JpaRepository<Candidature, Long> {
}
