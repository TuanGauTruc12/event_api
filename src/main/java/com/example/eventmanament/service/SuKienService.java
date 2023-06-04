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

	//add
	public void saveSuKien(SuKien SuKien) {
		repository.save(SuKien);
	}

	//get all
	public List<SuKien> getSuKiens() {
		return repository.findAll();
	}

	//get one
	public SuKien getSuKienById(int id) {
		return repository.findById(id).orElse(null);
	}

	//get search
	/*
	 public List<SuKien> getListByName(String name) { 
		 return repository.findByName(name);
	 }
	 */

	 //delete
	public void deleteSuKien(int id) {
		repository.deleteById(id);
	}

	//update
	public void updateSuKien(SuKien suKien) {
		SuKien existingSuKien = repository.findById(suKien.getMaSuKien()).orElse(null);
		existingSuKien.setTenSuKien(suKien.getTenSuKien());
		existingSuKien.setMoTaSuKien(suKien.getMoTaSuKien());
		existingSuKien.setHinhSuKien(suKien.getHinhSuKien());
		existingSuKien.setAnh(suKien.getAnh());
		existingSuKien.setDiaDiem(suKien.getDiaDiem());
		existingSuKien.setNgayToChuc(suKien.getNgayToChuc());
		existingSuKien.setNoiDung(suKien.getNoiDung());
		existingSuKien.setTin(suKien.getTin());
		repository.save(existingSuKien);
	}
}
