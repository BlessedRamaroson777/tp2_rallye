package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.TempsEpreuve;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TempsRepository extends JpaRepository<TempsEpreuve, java.io.Serializable> {

    @Query(value = "SELECT * FROM temps_epreuves t WHERE t.id_epreuve_speciale = :specialeId", nativeQuery = true)
    List<TempsEpreuve> findBySpeciale(@Param("specialeId") Integer specialeId);

    @Query(value = "SELECT * FROM temps_epreuves t WHERE t.id_epreuve_speciale = :specialeId AND t.id_equipage = :equipageId", nativeQuery = true)
    List<TempsEpreuve> findBySpecialeAndEquipage(@Param("specialeId") Integer specialeId, @Param("equipageId") Integer equipageId);

    @Query(value = "SELECT t.* FROM temps_epreuves t WHERE t.id_equipage IN (:equipageIds)", nativeQuery = true)
    List<TempsEpreuve> findByEquipageIds(@Param("equipageIds") List<Integer> equipageIds);
}
