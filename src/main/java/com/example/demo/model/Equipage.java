package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipages")
public class Equipage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipage")
    private Integer idEquipage;

    @Column(name = "nom")
    private String nom;

    @Column(name = "id_categorie_rallye")
    private Integer idCategorieRallye;

    @Column(name = "id_pilote")
    private Integer idPilote;

    @Column(name = "id_copilote")
    private Integer idCopilote;

    protected Equipage() {}

    public Equipage(String nom, Integer idCategorieRallye, Integer idPilote, Integer idCopilote) {
        this.nom = nom;
        this.idCategorieRallye = idCategorieRallye;
        this.idPilote = idPilote;
        this.idCopilote = idCopilote;
    }

    public Integer getIdEquipage() {
        return idEquipage;
    }

    public String getNom() {
        return nom;
    }

    public Integer getIdCategorieRallye() {
        return idCategorieRallye;
    }

    public Integer getIdPilote() {
        return idPilote;
    }

    public Integer getIdCopilote() {
        return idCopilote;
    }
}
