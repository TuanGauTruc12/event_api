package com.example.eventmanament.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.eventmanament.entity.KhachHang;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
	//@Query("SELECT k FROM KHACHHANG k WHERE k.EMAILKH = 1 AND k.PASS = 2")
	//Collection<KhachHang> findAllActiveUsers();
	//KhachHang login(String EMAILKH, String PASS);
}
