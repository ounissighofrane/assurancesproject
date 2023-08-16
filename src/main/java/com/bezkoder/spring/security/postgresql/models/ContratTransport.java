package com.bezkoder.spring.security.postgresql.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contratTransport")
public class ContratTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    // Other fields
    @ManyToOne
    @JoinColumn(name = "idClient")
    private client client;
    private String numOffre;
    private String dateEtablissement;
    private String dateEffet;
    private String dateExpiration;
    private String codeAbonnement;
    private String monnaie;
    private String typeTransport;
    private String codeRisque;
    private String conditionAssurance;
    private String alimentation;
    private String emballage;
    private String trajet;
    private String transit;
    private String valeursFacture;
    private String majorer;
    private String taxe;
    private String typeImpouExp;

    // Constructors
    public ContratTransport() {
    }

    public ContratTransport(client client, String numOffre, String dateEtablissement, String dateEffet,
                            String dateExpiration, String codeAbonnement, String monnaie, String typeTransport,
                            String codeRisque, String conditionAssurance, String alimentation, String emballage,
                            String trajet, String transit, String valeursFacture, String majorer, String taxe,
                            String typeImpouExp) {
        this.client = client;
        this.numOffre = numOffre;
        this.dateEtablissement = dateEtablissement;
        this.dateEffet = dateEffet;
        this.dateExpiration = dateExpiration;
        this.codeAbonnement = codeAbonnement;
        this.monnaie = monnaie;
        this.typeTransport = typeTransport;
        this.codeRisque = codeRisque;
        this.conditionAssurance = conditionAssurance;
        this.alimentation = alimentation;
        this.emballage = emballage;
        this.trajet = trajet;
        this.transit = transit;
        this.valeursFacture = valeursFacture;
        this.majorer = majorer;
        this.taxe = taxe;
        this.typeImpouExp = typeImpouExp;
    }

    // Getters and setters
    public Long getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(Long idContrat) {
        this.idContrat = idContrat;
    }

    public client getClient() {
        return client;
    }
    
    public void setClient(client client) {
        this.client = client;
    }

    public String getNumOffre() {
        return numOffre;
    }

    public void setNumOffre(String numOffre) {
        this.numOffre = numOffre;
    }

    public String getDateEtablissement() {
        return dateEtablissement;
    }

    public void setDateEtablissement(String dateEtablissement) {
        this.dateEtablissement = dateEtablissement;
    }

    public String getDateEffet() {
        return dateEffet;
    }

    public void setDateEffet(String dateEffet) {
        this.dateEffet = dateEffet;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getCodeAbonnement() {
        return codeAbonnement;
    }

    public void setCodeAbonnement(String codeAbonnement) {
        this.codeAbonnement = codeAbonnement;
    }

    public String getMonnaie() {
        return monnaie;
    }

    public void setMonnaie(String monnaie) {
        this.monnaie = monnaie;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public String getCodeRisque() {
        return codeRisque;
    }

    public void setCodeRisque(String codeRisque) {
        this.codeRisque = codeRisque;
    }

    public String getConditionAssurance() {
        return conditionAssurance;
    }

    public void setConditionAssurance(String conditionAssurance) {
        this.conditionAssurance = conditionAssurance;
    }

    public String getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }

    public String getEmballage() {
        return emballage;
    }

    public void setEmballage(String emballage) {
        this.emballage = emballage;
    }

    public String getTrajet() {
        return trajet;
    }

    public void setTrajet(String trajet) {
        this.trajet = trajet;
    }

    public String getTransit() {
        return transit;
    }

    public void setTransit(String transit) {
        this.transit = transit;
    }

    public String getValeursFacture() {
        return valeursFacture;
    }

    public void setValeursFacture(String valeursFacture) {
        this.valeursFacture = valeursFacture;
    }

    public String getMajorer() {
        return majorer;
    }

    public void setMajorer(String majorer) {
        this.majorer = majorer;
    }

    public String getTaxe() {
        return taxe;
    }

    public void setTaxe(String taxe) {
        this.taxe = taxe;
    }

    public String getTypeImpouExp() {
        return typeImpouExp;
    }

    public void setTypeImpouExp(String typeImpouExp) {
        this.typeImpouExp = typeImpouExp;
    }
}
