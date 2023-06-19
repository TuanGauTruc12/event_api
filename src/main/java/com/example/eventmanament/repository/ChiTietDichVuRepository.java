package com.example.eventmanament.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eventmanament.entity.ChiTietDichVu;
import com.example.eventmanament.entity.ChiTietDichVuId;
import com.example.eventmanament.entity.HopDong;

@Repository
public interface ChiTietDichVuRepository extends JpaRepository<ChiTietDichVu, ChiTietDichVuId>{
    List<ChiTietDichVu> findAllByHopDong(HopDong hopDong);
}
