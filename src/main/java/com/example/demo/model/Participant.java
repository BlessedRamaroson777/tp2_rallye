package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "participants")
public class Participant {

    @Id
    @Column(name = "id_participant")
    private Integer idParticipant;

    @Column(name = "nom")
    private String nom;

    protected Participant() {}

    public Participant(Integer idParticipant, String nom) {
        this.idParticipant = idParticipant;
        this.nom = nom;
    }

    public Integer getIdParticipant() {
        return idParticipant;
    }

    public String getNom() {
        return nom;
    }
}
