package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Equipage;

public interface EquipageRepository extends JpaRepository<Equipage, Integer> {

    @Query(value = "SELECT * FROM equipages e WHERE e.id_pilote = :piloteId", nativeQuery = true)
    List<Equipage> findByPiloteId(@Param("piloteId") Integer piloteId);

    @Query(value = "SELECT * FROM equipages e WHERE e.id_pilote = :piloteId AND e.id_categorie_rallye IN (SELECT id_categorie_rallye FROM categorie_rallyes WHERE id_rallye = :rallyeId)", nativeQuery = true)
    List<Equipage> findByPiloteIdAndRallye(@Param("piloteId") Integer piloteId, @Param("rallyeId") Integer rallyeId);
}
