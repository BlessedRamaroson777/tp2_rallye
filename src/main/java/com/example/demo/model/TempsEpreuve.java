package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "temps_epreuves")
@IdClass(TempsEpreuveId.class)
public class TempsEpreuve {

    @Id
    @Column(name = "id_epreuve_speciale")
    private Integer idEpreuveSpeciale;

    @Id
    @Column(name = "id_equipage")
    private Integer idEquipage;

    @Column(name = "temps")
    private Double temps;

    protected TempsEpreuve() {}

    public TempsEpreuve(Integer idEpreuveSpeciale, Integer idEquipage, Double temps) {
        this.idEpreuveSpeciale = idEpreuveSpeciale;
        this.idEquipage = idEquipage;
        this.temps = temps;
    }

    public Integer getIdEpreuveSpeciale() {
        return idEpreuveSpeciale;
    }

    public Integer getIdEquipage() {
        return idEquipage;
    }

    public Double getTemps() {
        return temps;
    }
}
