package com.bezkoder.spring.security.postgresql.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "client")
public class client {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long idClient;
     private String nom;
    private String prenom;
    private String cinourc;
    private String adresse;
    private String email;
    private String telephone;

    // Constructor
    public client(){
        
    }
    public client(String nom, String prenom, String cinourc, String adresse, String email, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.cinourc = cinourc;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
    }
    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCinourc() {
        return cinourc;
    }

    public void setCinourc(String cinourc) {
        this.cinourc = cinourc;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String get() {
        return null;
    }
}
