package com.example.eventmanament.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanament.entity.ChiTietDichVu;

@Repository
public interface ChiTietDichVuRepository extends JpaRepository<ChiTietDichVu, Integer>{

}
