package com.example.eventmanament.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.eventmanament.entity.KhachHang;
import com.example.eventmanament.repository.KhachHangRepository;

@Service
public class KhachHangService {

	// register(name, phone, passsword, email)
	// login(email, passsword)
	// change sdt, address
	@Autowired
	private KhachHangRepository repository;

	// Add
	public KhachHang register(KhachHang khachHang) {
		return repository.save(khachHang);
	}

	 //get one
	 public KhachHang login(String email, String password) {
		 return repository.findOneByEmailAndPassword(email, password);
	 }
	 

	// update
	public KhachHang updateKhachHang(KhachHang khachHang) {
		return repository.save(khachHang);
	}
	
	public KhachHang findKhachHangByID(int maKhachHang) {
		return repository.findById(maKhachHang).orElse(null);
	}
}
