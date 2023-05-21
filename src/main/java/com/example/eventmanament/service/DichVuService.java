package com.example.eventmanament.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanament.entity.DichVu;
import com.example.eventmanament.repository.DichVuRepository;

@Service
public class DichVuService {
	@Autowired
	private DichVuRepository repository;
	
	public DichVu saveDichVu(DichVu dichVu) {
		return repository.save(dichVu);
	}
	
	public List<DichVu> saveDichVus(List<DichVu> dichVus) {
		return repository.saveAll(dichVus);
	}

	public List<DichVu> getDichVus() {
		return repository.findAll();
	}

	public DichVu getDichVuById(int id) {
		return repository.findById(id).orElse(null);
	}

	// public DichVu getDichVuByName(String name) { // return
	// repository.findByName(name); // }

	public void deleteDichVu(int id) {
		repository.deleteById(id);
	}

	public DichVu updateDichVu(DichVu dichVu) {
		DichVu existingDichVu = repository.findById(dichVu.getMaDichVu()).orElse(null);
		existingDichVu.setTenDichVu(dichVu.getTenDichVu());
		existingDichVu.setSoLuong(dichVu.getSoLuong());
		existingDichVu.setGia(dichVu.getGia());
		existingDichVu.setDonViTinh(dichVu.getDonViTinh());
		return repository.save(existingDichVu);
	}
	
}
