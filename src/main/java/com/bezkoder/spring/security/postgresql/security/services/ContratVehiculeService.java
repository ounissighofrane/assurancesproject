package com.bezkoder.spring.security.postgresql.security.services;

import java.util.List;

import com.bezkoder.spring.security.postgresql.models.ContratVehicule;



public interface ContratVehiculeService {

    List<ContratVehicule> getAllContrats();
    ContratVehicule createContrat(ContratVehicule contratVehicule);
    ContratVehicule updateContrat(Long id, ContratVehicule updatedContrat);
    void deleteContrat(Long id);
}

