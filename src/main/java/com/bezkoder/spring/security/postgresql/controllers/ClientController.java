package com.bezkoder.spring.security.postgresql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.security.postgresql.models.client;
import com.bezkoder.spring.security.postgresql.security.services.ClientService;

@RestController
@RequestMapping("/api/client")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public List<client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/")
    public client createClient(@RequestBody client client) {
        return clientService.createClient(client);
    }

    @PutMapping("/{id}")
    public client updateClient(@PathVariable Long id, @RequestBody client updatedClient) {
        return clientService.updateClient(id, updatedClient);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    // Other controller methods for CRUD operations
}
