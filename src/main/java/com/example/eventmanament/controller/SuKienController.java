package com.example.eventmanament.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
    @GetMapping("/getSuKienByID/{id}")
    public SuKien getSuKienByID(@PathVariable(name = "id") int id) {
    	return service.getSuKienById(id);
    }
    
	@GetMapping("/findByIdCategoryEvent/{idCategory}")
	public List<SuKien> findAllSuKiensByCategoryEvent(@PathVariable(name = "idCategory") int idCategory) {
		List<SuKien> suKiens = service.getSuKiens();
		List<SuKien> sukiensByCategory = new ArrayList<>();
		for (SuKien suKien : suKiens) {
			if(suKien.getLoaiSuKien().getMaLoaiSuKien() == idCategory) {
				sukiensByCategory.add(suKien);
			}
		}
		return sukiensByCategory;
	}
	
	@PostMapping("/")
	public void saveSuKien(@RequestBody SuKien suKien) {
		service.saveSuKien(suKien);
	}
	
    @PutMapping("/")
    public void updateSuKien(@RequestBody SuKien suKien) {
      service.updateSuKien(suKien);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteSukien(@PathVariable(name = "id") int id) {
        service.deleteSuKien(id);
    }
}
