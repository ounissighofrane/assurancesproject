package com.bezkoder.spring.security.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bezkoder.spring.security.postgresql.models.ContratTransport;

public interface ContratTransportRepository extends JpaRepository<ContratTransport, Long> {
    // Add custom query methods if needed
}
