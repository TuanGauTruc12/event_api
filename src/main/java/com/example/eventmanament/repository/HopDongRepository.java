package com.example.eventmanament.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.eventmanament.entity.HopDong;

@Repository
public interface HopDongRepository extends JpaRepository<HopDong, Integer> {
	@Query("SELECT hd FROM HopDong hd WHERE hd.khachHang.maKhachHang = :maKH GROUP BY hd, hd.khachHang.maKhachHang")
	List<HopDong> findByMaKHDistinct(@Param("maKH") int maKH);
}
