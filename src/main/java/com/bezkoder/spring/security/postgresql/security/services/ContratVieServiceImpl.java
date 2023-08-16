package com.bezkoder.spring.security.postgresql.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bezkoder.spring.security.postgresql.models.ContratVie;
import com.bezkoder.spring.security.postgresql.repository.ContratVieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContratVieServiceImpl implements ContratVieService {

    @Autowired
    private ContratVieRepository contratVieRepository;

    @Override
    public List<ContratVie> getAllContratsVie() {
        return contratVieRepository.findAll();
    }

    @Override
    public ContratVie getContratVieById(Long id) {
        Optional<ContratVie> contratVie = contratVieRepository.findById(id);
        return contratVie.orElse(null);
    }

    @Override
    public ContratVie createContratVie(ContratVie contratVie) {
        return contratVieRepository.save(contratVie);
    }

    @Override
    public ContratVie updateContratVie(Long id, ContratVie contratVie) {
        if (!contratVieRepository.existsById(id)) {
            return null;
        }
        contratVie.setIdContrat(id);
        return contratVieRepository.save(contratVie);
    }

    @Override
    public boolean deleteContratVie(Long id) {
        if (!contratVieRepository.existsById(id)) {
            return false;
        }
        contratVieRepository.deleteById(id);
        return true;
    }
}

