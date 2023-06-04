package com.example.eventmanament.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanament.entity.HopDong;

@Repository
public interface HopDongRepository extends JpaRepository<HopDong, Integer> {

}
