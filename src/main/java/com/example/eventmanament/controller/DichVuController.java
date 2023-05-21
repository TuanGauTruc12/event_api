package com.example.eventmanament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanament.entity.DichVu;
import com.example.eventmanament.service.DichVuService;

@RestController
@RequestMapping("/services")
public class DichVuController {
	@Autowired
	private DichVuService service;

	@GetMapping("/")
	public List<DichVu> findAllDichVu() {
		return service.getDichVus();
	}
}
