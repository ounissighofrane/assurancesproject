package com.bezkoder.spring.security.postgresql.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contratVehicule")
public class ContratVehicule {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    // Other fields
    private String typeUsage;
    private String marque;
    private String version;
    private int puissanceFiscale;
    private int cylindree;
    private int nombrePlaces;
    private String formatImmatriculation;
     @ManyToOne
    @JoinColumn(name = "idClient")
    private client client;
// Constructors
public ContratVehicule() {
}

public ContratVehicule(String typeUsage, String marque, String version,
                       int puissanceFiscale, int cylindree, int nombrePlaces,
                       String formatImmatriculation, client client) {
    this.typeUsage = typeUsage;
    this.marque = marque;
    this.version = version;
    this.puissanceFiscale = puissanceFiscale;
    this.cylindree = cylindree;
    this.nombrePlaces = nombrePlaces;
    this.formatImmatriculation = formatImmatriculation;
    this.client = client;
}

// Getters and setters
public Long getIdContrat() {
    return idContrat;
}

public void setIdContrat(Long idContrat) {
    this.idContrat = idContrat;
}

public String getTypeUsage() {
    return typeUsage;
}

public void setTypeUsage(String typeUsage) {
    this.typeUsage = typeUsage;
}

public String getMarque() {
    return marque;
}

public void setMarque(String marque) {
    this.marque = marque;
}

public String getVersion() {
    return version;
}

public void setVersion(String version) {
    this.version = version;
}

public int getPuissanceFiscale() {
    return puissanceFiscale;
}

public void setPuissanceFiscale(int puissanceFiscale) {
    this.puissanceFiscale = puissanceFiscale;
}

public int getCylindree() {
    return cylindree;
}

public void setCylindree(int cylindree) {
    this.cylindree = cylindree;
}

public int getNombrePlaces() {
    return nombrePlaces;
}

public void setNombrePlaces(int nombrePlaces) {
    this.nombrePlaces = nombrePlaces;
}

public String getFormatImmatriculation() {
    return formatImmatriculation;
}

public void setFormatImmatriculation(String formatImmatriculation) {
    this.formatImmatriculation = formatImmatriculation;
}

public client getClient() {
    return client;
}

public void setClient(client client) {
    this.client = client;
}
   
}

