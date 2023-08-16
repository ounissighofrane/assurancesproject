package com.bezkoder.spring.security.postgresql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bezkoder.spring.security.postgresql.models.ContratTransport;
import com.bezkoder.spring.security.postgresql.security.services.ContratTransportService;

import java.util.List;

@RestController
@RequestMapping("/api/contrats-transport")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ContratTransportController {

    @Autowired
    private ContratTransportService contratTransportService;

    @GetMapping("/")
    public List<ContratTransport> getAllContrats() {
        return contratTransportService.getAllContrats();
    }

    @GetMapping("/{id}")
    public ContratTransport getContratById(@PathVariable Long id) {
        return contratTransportService.getContratById(id);
    }

    @PostMapping("/")
    public ContratTransport createContrat(@RequestBody ContratTransport contratTransport) {
        return contratTransportService.createContrat(contratTransport);
    }

    @PutMapping("/{id}")
    public ContratTransport updateContrat(@PathVariable Long id, @RequestBody ContratTransport contratTransport) {
        return contratTransportService.updateContrat(id, contratTransport);
    }

    @DeleteMapping("/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratTransportService.deleteContrat(id);
    }
}
