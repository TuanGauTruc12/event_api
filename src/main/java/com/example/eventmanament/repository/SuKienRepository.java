package com.example.eventmanament.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanament.entity.SuKien;

@Repository
public interface SuKienRepository extends JpaRepository<SuKien, Long> {
	//List<SuKien> findByName(String TENSK);
}
