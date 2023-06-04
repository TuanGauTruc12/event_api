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
	
	//Add
	public void saveDichVu(DichVu dichVu) {
		repository.save(dichVu);
	}
	
	//Get All
	public List<DichVu> getDichVus() {
		return repository.findAll();
	}

	//get one
	public DichVu getDichVuById(int id) {
		return repository.findById(id).orElse(null);
	}

	//delete
	public void deleteDichVu(int id) {
		repository.deleteById(id);
	}

	//update
	public void updateDichVu(DichVu dichVu) {
		DichVu existingDichVu = repository.findById(dichVu.getMaDichVu()).orElse(null);
		existingDichVu.setTenDichVu(dichVu.getTenDichVu());
		existingDichVu.setSoLuong(dichVu.getSoLuong());
		existingDichVu.setGia(dichVu.getGia());
		existingDichVu.setDonViTinh(dichVu.getDonViTinh());
		repository.save(existingDichVu);
	}
	
}
