package com.bezkoder.spring.security.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.security.postgresql.models.ContratVehicule;



@Repository
public interface ContratVehiculeRepository extends JpaRepository<ContratVehicule, Long> {

    // You can add custom query methods here if needed
}
