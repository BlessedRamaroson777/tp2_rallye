package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CategorieRallye;

import java.util.List;

public interface CategorieRallyeRepository extends JpaRepository<CategorieRallye, Integer> {
    List<CategorieRallye> findByIdRallye(Integer idRallye);
}
