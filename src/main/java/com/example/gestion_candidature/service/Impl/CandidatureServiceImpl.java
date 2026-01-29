package com.example.gestion_candidature.service.Impl;

import com.example.gestion_candidature.dao.CandidatureDao;
import com.example.gestion_candidature.entity.Candidature;
import com.example.gestion_candidature.service.facade.CandidatureService;
import com.example.gestion_candidature.service.facade.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CandidatureServiceImpl implements CandidatureService {

    @Override
    public int saveCandidature(Candidature candidature) {
        if (dao.findById(candidature.getId()) != null) {
            return -1;
        }else {
            candidature.setDate(LocalDateTime.now());
            candidature.setUser(userservice.findByFullName(candidature.getUser().getFullName()));
            candidature.setStatus("New");
            dao.save(candidature);
        }
        return 1;
    }

    @Override
    public Candidature findByUserFullName(String userFullName) {
        return dao.findByUserFullName(userFullName);
    }

    @Override
    public Candidature findByUserEmail(String email) {
        return dao.findByUserEmail(email);
    }

    @Override
    public List<Candidature> findCandidatureByStatus(String status) {
        return dao.findCandidatureByStatus(status);
    }

    @Override
    public Candidature findCandidatureById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Candidature> findByStatus(String status) {
        return dao.findByStatus(status);
    }





    public CandidatureServiceImpl(UserService userservice, CandidatureDao dao) {
        this.userservice = userservice;
        this.dao = dao;
    }

    private UserService userservice;
    private CandidatureDao dao;
}
