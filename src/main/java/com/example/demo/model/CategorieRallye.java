package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorie_rallyes")
public class CategorieRallye {

    @Id
    @Column(name = "id_categorie_rallye")
    private Integer idCategorieRallye;

    @Column(name = "id_categorie")
    private Integer idCategorie;

    @Column(name = "id_rallye")
    private Integer idRallye;

    protected CategorieRallye() {}

    public CategorieRallye(Integer idCategorieRallye, Integer idCategorie, Integer idRallye) {
        this.idCategorieRallye = idCategorieRallye;
        this.idCategorie = idCategorie;
        this.idRallye = idRallye;
    }

    public Integer getIdCategorieRallye() {
        return idCategorieRallye;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public Integer getIdRallye() {
        return idRallye;
    }
}
