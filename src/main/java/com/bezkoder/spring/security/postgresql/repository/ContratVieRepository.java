package com.bezkoder.spring.security.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bezkoder.spring.security.postgresql.models.ContratVie;

public interface ContratVieRepository extends JpaRepository<ContratVie, Long> {
    // Add custom query methods if needed
}
