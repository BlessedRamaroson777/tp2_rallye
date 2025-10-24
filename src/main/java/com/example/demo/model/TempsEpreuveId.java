package com.example.demo.model;

import java.io.Serializable;

public class TempsEpreuveId implements Serializable {
    private Integer idEpreuveSpeciale;
    private Integer idEquipage;

    public TempsEpreuveId() {}

    public TempsEpreuveId(Integer idEpreuveSpeciale, Integer idEquipage) {
        this.idEpreuveSpeciale = idEpreuveSpeciale;
        this.idEquipage = idEquipage;
    }

    // equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TempsEpreuveId that = (TempsEpreuveId) o;
        return idEpreuveSpeciale.equals(that.idEpreuveSpeciale) && idEquipage.equals(that.idEquipage);
    }

    @Override
    public int hashCode() {
        return idEpreuveSpeciale.hashCode() * 31 + idEquipage.hashCode();
    }
}
