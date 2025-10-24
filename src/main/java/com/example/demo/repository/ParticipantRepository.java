package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {

    @Query(value = "SELECT DISTINCT p.* FROM participants p "
            + "JOIN equipages e ON p.id_participant = e.id_pilote "
            + "JOIN categorie_rallyes cr ON e.id_categorie_rallye = cr.id_categorie_rallye "
            + "WHERE cr.id_rallye = :rallyeId", nativeQuery = true)
    List<Participant> findPilotesByRallyeId(@Param("rallyeId") Integer rallyeId);
}