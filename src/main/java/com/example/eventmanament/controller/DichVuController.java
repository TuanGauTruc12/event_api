package com.example.eventmanament.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
    @GetMapping("/update/{id}")
    public DichVu updateDichVu(@PathVariable(name = "id") int id) {
    	return service.getDichVuById(id);
    }
	
	@PostMapping("/")
	public void saveDichVu(@RequestBody DichVu DichVu) {
		service.saveDichVu(DichVu);
	}
	
    @PutMapping("/update")
    public void updateDichVu(@RequestBody DichVu DichVu) {
      service.updateDichVu(DichVu);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteDichVu(@PathVariable(name = "id") int id) {
        service.deleteDichVu(id);
    }
	
}
