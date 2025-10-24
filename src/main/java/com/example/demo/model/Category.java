package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @Column(name = "id_categorie")
    private Integer idCategorie;

    @Column(name = "valeur")
    private String valeur;

    protected Category() {}

    public Category(Integer idCategorie, String valeur) {
        this.idCategorie = idCategorie;
        this.valeur = valeur;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public String getValeur() {
        return valeur;
    }
}
