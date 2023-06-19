package com.example.eventmanament.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanament.dto.UserDTO;
import com.example.eventmanament.entity.KhachHang;
import com.example.eventmanament.service.KhachHangService;

@RestController
@RequestMapping("/customer")
public class KhachHangController {
	
	@Autowired
	private KhachHangService service;
	
	@GetMapping("/getByID/{id}")
	public KhachHang khachHang(@PathVariable int id) {
		return service.findKhachHangByID(id);
	}
	
	//
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password) {
		KhachHang khachHang = service.login(email, password);
		if(khachHang == null) {
			return new ResponseEntity<String>("",HttpStatus.INTERNAL_SERVER_ERROR);
		}else {
			UserDTO dto = new UserDTO(khachHang.getMaKhachHang(), khachHang.getTenKhachHang(), khachHang.getImage(), khachHang.getEmail(), khachHang.getSoDienThoai());
			return new ResponseEntity<String>(dto.toString(), HttpStatus.OK);
		}
	}
}
