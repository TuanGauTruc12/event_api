package com.example.eventmanament.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanament.entity.SuKien;

public interface SuKienRepository extends JpaRepository<SuKien, Integer> {
}
