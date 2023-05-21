package com.example.eventmanament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanament.entity.SuKien;
import com.example.eventmanament.service.SuKienService;

@RestController
@RequestMapping("/events")
@CrossOrigin(origins = "http://localhost:3000")
public class SuKienController {
	@Autowired
	private SuKienService service;
	
	@GetMapping("/")
	public List<SuKien> findAllSuKiens() {
		List<SuKien> suKiens = service.getSuKiens();
		return suKiens;
	}
}
