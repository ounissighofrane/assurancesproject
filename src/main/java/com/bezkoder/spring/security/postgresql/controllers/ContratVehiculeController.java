package com.bezkoder.spring.security.postgresql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.security.postgresql.models.ContratVehicule;
import com.bezkoder.spring.security.postgresql.security.services.ContratVehiculeService;

@RestController
@RequestMapping("/api/contrats-vehicule")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ContratVehiculeController {

    @Autowired
    private ContratVehiculeService contratService;

    @GetMapping
    public List<ContratVehicule> getAllContrats() {
        return contratService.getAllContrats();
    }

    // Other controller methods for CRUD operations
}

