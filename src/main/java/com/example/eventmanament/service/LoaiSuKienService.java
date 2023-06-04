package com.example.eventmanament.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanament.entity.LoaiSuKien;
import com.example.eventmanament.repository.LoaiSuKienReponsitory;

@Service
public class LoaiSuKienService {
	@Autowired
	LoaiSuKienReponsitory reponsitory;

	// Add
	public LoaiSuKien saveLoaiSuKien(LoaiSuKien loaiSuKien) {
		return reponsitory.save(loaiSuKien);
	}

	// Get All
	public List<LoaiSuKien> getLoaiSuKiens() {
		return reponsitory.findAll();
	}

	// get one
	public LoaiSuKien getLoaiSuKienById(int id) {
		return reponsitory.findById(id).orElse(null);
	}

	// delete
	public void deleteLoaiSuKien(int id) {
		reponsitory.deleteById(id);
	}

	// update
	public LoaiSuKien updateLoaiSuKien(LoaiSuKien loaiSuKien) {
		LoaiSuKien existingLoaiSuKien = reponsitory.findById(loaiSuKien.getMaLoaiSuKien()).orElse(null);
		existingLoaiSuKien.setTenLoaiSuKien(loaiSuKien.getTenLoaiSuKien());
		return reponsitory.save(existingLoaiSuKien);
	}

}
