package com.example.gestion_candidature.service.facade;

import com.example.gestion_candidature.entity.Candidature;

import java.util.List;

public interface CandidatureService {
    int saveCandidature(Candidature candidature);

    Candidature findByUserFullName(String userFullName);

    Candidature findByUserEmail(String email);

    List<Candidature> findCandidatureByStatus(String status);

    Candidature findCandidatureById(long id);
}
