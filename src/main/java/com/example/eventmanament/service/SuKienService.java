package com.example.eventmanament.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanament.entity.SuKien;
import com.example.eventmanament.repository.SuKienRepository;

@Service
public class SuKienService {
	@Autowired
	private SuKienRepository repository;

	public SuKien saveSuKien(SuKien SuKien) {
		return repository.save(SuKien);
	}
	
	public List<SuKien> saveSuKiens(List<SuKien> SuKiens) {
		return repository.saveAll(SuKiens);
	}

	public List<SuKien> getSuKiens() {
		return repository.findAll();
	}

	public SuKien getSuKienById(int id) {
		return repository.findById(id).orElse(null);
	}

	// public SuKien getSuKienByName(String name) { // return
	// repository.findByName(name); // }

	public void deleteSuKien(int id) {
		repository.deleteById(id);
	}

	public SuKien updateSuKien(SuKien SuKien) {
		SuKien existingSuKien = repository.findById(SuKien.getMaSuKien()).orElse(null);
		existingSuKien.setTenSuKien(SuKien.getTenSuKien());
		existingSuKien.setMoTaSuKien(SuKien.getMoTaSuKien());
		existingSuKien.setHinhSuKien(SuKien.getHinhSuKien());
		return repository.save(existingSuKien);
	}
}
