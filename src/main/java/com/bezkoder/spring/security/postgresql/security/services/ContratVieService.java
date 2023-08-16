package com.bezkoder.spring.security.postgresql.security.services;

import com.bezkoder.spring.security.postgresql.models.ContratVie;

import java.util.List;

public interface ContratVieService {
    List<ContratVie> getAllContratsVie();

    ContratVie getContratVieById(Long id);

    ContratVie createContratVie(ContratVie contratVie);

    ContratVie updateContratVie(Long id, ContratVie contratVie);

    boolean deleteContratVie(Long id);

    // Add other service methods as needed
}
