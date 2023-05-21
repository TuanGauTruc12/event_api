package com.example.eventmanament.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanament.entity.DichVu;

@Repository
public interface DichVuRepository extends JpaRepository<DichVu, Integer>{

}
