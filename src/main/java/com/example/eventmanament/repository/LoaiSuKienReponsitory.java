package com.example.eventmanament.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanament.entity.LoaiSuKien;

@Repository
public interface LoaiSuKienReponsitory extends JpaRepository<LoaiSuKien, Integer>{
}
