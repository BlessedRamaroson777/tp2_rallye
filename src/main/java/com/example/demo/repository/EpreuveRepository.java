package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EpreuveSpeciale;

public interface EpreuveRepository extends JpaRepository<EpreuveSpeciale, Integer> {
    List<EpreuveSpeciale> findByIdRallye(Integer idRallye);
}
