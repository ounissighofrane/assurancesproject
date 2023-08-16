package com.bezkoder.spring.security.postgresql.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bezkoder.spring.security.postgresql.models.ContratTransport;
import com.bezkoder.spring.security.postgresql.repository.ContratTransportRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContratTransportServiceImpl implements ContratTransportService {

    @Autowired
    private ContratTransportRepository contratTransportRepository;


    @Override
    public List<ContratTransport> getAllContrats() {
        return contratTransportRepository.findAll();
    }

    @Override
    public ContratTransport getContratById(Long id) {
        return contratTransportRepository.findById(id).orElse(null);
    }

    @Override
    public ContratTransport createContrat(ContratTransport contratTransport) {
        return contratTransportRepository.save(contratTransport);
    }

    @Override
public ContratTransport updateContrat(Long id, ContratTransport updatedContrat) {

    if (id == null) {
        throw new IllegalArgumentException("Contrat ID cannot be null for update.");
    }
    Optional<ContratTransport> existingContratOptional = contratTransportRepository.findById(id);
    if (existingContratOptional.isPresent()) {
        ContratTransport existingContrat = existingContratOptional.get();
        existingContrat.setNumOffre(updatedContrat.getNumOffre());
        existingContrat.setDateEtablissement(updatedContrat.getDateEtablissement());
        existingContrat.setDateEffet(updatedContrat.getDateEffet());
        existingContrat.setDateExpiration(updatedContrat.getDateExpiration());
        existingContrat.setCodeAbonnement(updatedContrat.getCodeAbonnement());
        existingContrat.setMonnaie(updatedContrat.getMonnaie());
        existingContrat.setTypeTransport(updatedContrat.getTypeTransport());
        existingContrat.setCodeRisque(updatedContrat.getCodeRisque());
        existingContrat.setConditionAssurance(updatedContrat.getConditionAssurance());
        existingContrat.setAlimentation(updatedContrat.getAlimentation());
        existingContrat.setEmballage(updatedContrat.getEmballage());
        existingContrat.setTrajet(updatedContrat.getTrajet());
        existingContrat.setTransit(updatedContrat.getTransit());
        existingContrat.setValeursFacture(updatedContrat.getValeursFacture());
        existingContrat.setMajorer(updatedContrat.getMajorer());
        existingContrat.setTaxe(updatedContrat.getTaxe());
        existingContrat.setTypeImpouExp(updatedContrat.getTypeImpouExp());

        // Update the associated client (if necessary)
        existingContrat.setClient(updatedContrat.getClient());

        // Save the updated contrat and return
        return contratTransportRepository.save(existingContrat);
    }else {
        throw new IllegalArgumentException("No contrat found with the provided ID.");
    }
}


    @Override
    public void deleteContrat(Long id) {
        contratTransportRepository.deleteById(id);
    }
}
