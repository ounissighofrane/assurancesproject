package com.bezkoder.spring.security.postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.security.postgresql.models.client;

@Repository
public interface ClientRepository extends JpaRepository<client, Long> {

    // You can add custom query methods here if needed
}

