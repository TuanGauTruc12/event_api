package com.example.eventmanament.controller;

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

import com.example.eventmanament.entity.LoaiSuKien;
import com.example.eventmanament.service.LoaiSuKienService;

@RestController
@RequestMapping("/category-event")
@CrossOrigin(origins = "http://localhost:3000")
public class LoaiSuKienController {
	
	@Autowired
	private LoaiSuKienService service;
	
	@GetMapping("/")
	public List<LoaiSuKien> findAllLoaiSuKiens() {
		return service.getLoaiSuKiens();
	}
	
    @GetMapping("/getLoaiSuKienByID/{id}")
    public LoaiSuKien getLoaiSuKienByID(@PathVariable(name = "id") int id) {
    	return service.getLoaiSuKienById(id);
    }
	
	@PostMapping("/")
	public void saveLoaiSuKien(@RequestBody LoaiSuKien loaiSuKien) {
		service.saveLoaiSuKien(loaiSuKien);
	}
	
    @PutMapping("/")
    public void updateSuKien(@RequestBody LoaiSuKien suKien) {
      service.updateLoaiSuKien(suKien);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteLoaiSuKien(@PathVariable(name = "id") int id) {
        service.deleteLoaiSuKien(id);
    }
}
