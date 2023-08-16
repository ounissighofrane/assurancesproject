package com.bezkoder.spring.security.postgresql.security.services;

import java.util.List;

import com.bezkoder.spring.security.postgresql.models.client;

public interface ClientService {

    List<client> getAllClients();
    client getClientById(Long id);
    client createClient(client client);
    client updateClient(Long id,client updatedClient);
    void deleteClient(Long id);
}

