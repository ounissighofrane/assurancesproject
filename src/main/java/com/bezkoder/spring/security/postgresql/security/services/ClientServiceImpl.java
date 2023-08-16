package com.bezkoder.spring.security.postgresql.security.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.security.postgresql.models.client;
import com.bezkoder.spring.security.postgresql.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public client createClient(client client) {
        return clientRepository.save(client);
    }

    @Override
    public client updateClient(Long id, client updatedClient) {
        if (id == null) {
            // Handle the case where ID is null (e.g., throw an exception or return an error response)
            // For example:
            throw new IllegalArgumentException("Client ID cannot be null for update.");
        }
        
        Optional<client> existingClientOptional = clientRepository.findById(id);
        if (existingClientOptional.isPresent()) {
            client existingClient = existingClientOptional.get();
            existingClient.setNom(updatedClient.getNom());
            existingClient.setPrenom(updatedClient.getPrenom());
            existingClient.setCinourc(updatedClient.getCinourc());
            existingClient.setAdresse(updatedClient.getAdresse());
            existingClient.setEmail(updatedClient.getEmail());
            existingClient.setTelephone(updatedClient.getTelephone());
            return clientRepository.save(existingClient);
        } else {
            // Handle the case where no existing client with the provided ID is found
            // For example:
            throw new IllegalArgumentException("No client found with the provided ID.");
        }
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}

