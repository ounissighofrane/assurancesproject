package com.bezkoder.spring.security.postgresql.security.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.spring.security.postgresql.models.ContratVehicule;
import com.bezkoder.spring.security.postgresql.repository.ContratVehiculeRepository;

@Service
public class ContratVehiculeServiceImpl implements ContratVehiculeService {

    @Autowired
    private ContratVehiculeRepository contratVehiculeRepository;

    @Override
    public List<ContratVehicule> getAllContrats() {
        return contratVehiculeRepository.findAll();
    }

    @Override
    public ContratVehicule createContrat(ContratVehicule contratVehicule) {
        return contratVehiculeRepository.save(contratVehicule);
    }

    @Override
    public ContratVehicule updateContrat(Long id, ContratVehicule updatedContrat) {
        if (id == null) {
            throw new IllegalArgumentException("Contrat ID cannot be null for update.");
        }
        Optional<ContratVehicule> existingContratOptional = contratVehiculeRepository.findById(id);
        if (existingContratOptional.isPresent()) {
            ContratVehicule existingContrat = existingContratOptional.get();

            // Update fields of existingContrat using updatedContrat
           /* existingContrat.setTypeUsage(updatedContrat.getTypeUsage());
            existingContrat.setMarque(updatedContrat.getMarque());
            existingContrat.setVersion(updatedContrat.getVersion());
            existingContrat.setPuissanceFiscale(updatedContrat.getPuissanceFiscale());
            existingContrat.setCylindree(updatedContrat.getCylindree());
            existingContrat.setNombrePlaces(updatedContrat.getNombrePlaces());
            existingContrat.setFormatImmatriculation(updatedContrat.getFormatImmatriculation());

            // Update the associated client (if necessary)
            existingContrat.setClient(updatedContrat.getClient());*/

            // Save the updated contrat and return
            return contratVehiculeRepository.save(existingContrat);
        }else {
            throw new IllegalArgumentException("No contrat found with the provided ID.");
        }
    }

    @Override
    public void deleteContrat(Long id) {
        contratVehiculeRepository.deleteById(id);
    }
}

