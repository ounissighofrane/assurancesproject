package com.bezkoder.spring.security.postgresql.security.services;

import com.bezkoder.spring.security.postgresql.models.ContratTransport;

import java.util.List;

public interface ContratTransportService {
    List<ContratTransport> getAllContrats();

    ContratTransport getContratById(Long id);

    ContratTransport createContrat(ContratTransport contratTransport);

    ContratTransport updateContrat(Long id, ContratTransport contratTransport);

    void deleteContrat(Long id);
}
