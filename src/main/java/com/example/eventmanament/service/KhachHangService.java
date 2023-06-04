package com.example.eventmanament.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanament.controller.KhachHangController;
import com.example.eventmanament.entity.DichVu;
import com.example.eventmanament.entity.KhachHang;
import com.example.eventmanament.repository.DichVuRepository;
import com.example.eventmanament.repository.KhachHangRepository;

@Service
public class KhachHangService {

	//register(name, phone, passsword, email)
	//login(email, passsword)
	//change sdt, address
	@Autowired
	private KhachHangRepository repository;
	
	//Add
	public KhachHang register(KhachHang khachHang) {
		return repository.save(khachHang);
	}

	//get one
	//public KhachHang login(String email, String password) {
		//return repository.login(email, password);
	//}

	// public DichVu getDichVuByName(String name) { // return
	// repository.findByName(name); // }

	//update
	public KhachHang updateKhachHang(KhachHang khachHang) {
		KhachHang existingKhachHang = repository.findById(khachHang.getMaKhachHang()).orElse(null);
		existingKhachHang.setTenKhachHang(khachHang.getTenKhachHang());
		existingKhachHang.setSoDienThoai(khachHang.getSoDienThoai());
		existingKhachHang.setDiaChi(khachHang.getDiaChi());
		existingKhachHang.setEmail(khachHang.getEmail());
		existingKhachHang.setPassword(khachHang.getPassword());
		return repository.save(existingKhachHang);
	}
}
