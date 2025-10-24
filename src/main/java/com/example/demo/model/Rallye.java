package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rallyes")
public class Rallye {

    @Id
    @Column(name = "id_rallye")
    private Integer idRallye;

    @Column(name = "nom")
    private String nom;

    @Column(name = "date_rallye")
    private LocalDate dateRallye;

    protected Rallye() {}

    public Rallye(Integer idRallye, String nom, LocalDate dateRallye) {
        this.idRallye = idRallye;
        this.nom = nom;
        this.dateRallye = dateRallye;
    }

    public Integer getIdRallye() {
        return idRallye;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDateRallye() {
        return dateRallye;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateRallye(LocalDate dateRallye) {
        this.dateRallye = dateRallye;
    }
}
