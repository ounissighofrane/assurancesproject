package com.bezkoder.spring.security.postgresql.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contratVie")
public class ContratVie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private String fonction;
    private String status;
    private int nbrEnfant;
    private String maladie;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private client client;

    // Constructors
    public ContratVie() {
    }

    public ContratVie(String fonction, String status, int nbrEnfant, String maladie, client client) {
        this.fonction = fonction;
        this.status = status;
        this.nbrEnfant = nbrEnfant;
        this.maladie = maladie;
        this.client = client;
    }

    // Getters and setters
    public Long getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(Long idContrat) {
        this.idContrat = idContrat;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }

    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    public client getClient() {
        return client;
    }

    public void setClient(client client) {
        this.client = client;
    }
}

