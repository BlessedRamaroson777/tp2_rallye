package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "epreuve_speciales")
public class EpreuveSpeciale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_epreuve_speciale")
    private Integer idEpreuveSpeciale;

    @Column(name = "nom")
    private String nom;

    @Column(name = "distance")
    private Double distance;

    @Column(name = "date_epreuve")
    private LocalDate dateEpreuve;

    @Column(name = "id_rallye")
    private Integer idRallye;

    protected EpreuveSpeciale() {}

    public EpreuveSpeciale(String nom, Double distance, LocalDate dateEpreuve, Integer idRallye) {
        this.nom = nom;
        this.distance = distance;
        this.dateEpreuve = dateEpreuve;
        this.idRallye = idRallye;
    }

    public Integer getIdEpreuveSpeciale() {
        return idEpreuveSpeciale;
    }

    public String getNom() {
        return nom;
    }

    public Double getDistance() {
        return distance;
    }

    public LocalDate getDateEpreuve() {
        return dateEpreuve;
    }

    public Integer getIdRallye() {
        return idRallye;
    }
}
