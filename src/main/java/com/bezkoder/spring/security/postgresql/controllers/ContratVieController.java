package com.bezkoder.spring.security.postgresql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bezkoder.spring.security.postgresql.models.ContratVie;
import com.bezkoder.spring.security.postgresql.security.services.ContratVieService;

import java.util.List;

@RestController
@RequestMapping("/api/contrats-vie")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ContratVieController {

    @Autowired
    private ContratVieService contratVieService;

    @GetMapping
    public ResponseEntity<List<ContratVie>> getAllContratsVie() {
        List<ContratVie> contratsVie = contratVieService.getAllContratsVie();
        return ResponseEntity.ok(contratsVie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContratVie> getContratVieById(@PathVariable Long id) {
        ContratVie contratVie = contratVieService.getContratVieById(id);
        if (contratVie == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(contratVie);
    }

    @PostMapping
    public ResponseEntity<ContratVie> createContratVie(@RequestBody ContratVie contratVie) {
        ContratVie newContratVie = contratVieService.createContratVie(contratVie);
        return ResponseEntity.ok(newContratVie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContratVie> updateContratVie(@PathVariable Long id, @RequestBody ContratVie contratVie) {
        ContratVie updatedContratVie = contratVieService.updateContratVie(id, contratVie);
        if (updatedContratVie == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedContratVie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContratVie(@PathVariable Long id) {
        boolean deleted = contratVieService.deleteContratVie(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}

