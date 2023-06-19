package com.example.eventmanament.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.eventmanament.entity.SuKien;
import com.example.eventmanament.service.SuKienService;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	public SuKien getSuKienByID(@PathVariable(name = "id") long id) {
		return service.getSuKienById(id);
	}

	@GetMapping("/findByIdCategoryEvent/{idCategory}")
	public List<SuKien> findAllSuKiensByCategoryEvent(@PathVariable(name = "idCategory") int idCategory) {
		List<SuKien> suKiens = service.getSuKiens();
		List<SuKien> sukiensByCategory = new ArrayList<>();
		for (SuKien suKien : suKiens) {
			if (suKien.getLoaiSuKien().getMaLoaiSuKien() == idCategory) {
				sukiensByCategory.add(suKien);
			}
		}
		return sukiensByCategory;
	}

	@Autowired
	private ResourceLoader resourceLoader;

	@PostMapping("/")
	public String saveSuKien(MultipartHttpServletRequest request) {

		MultipartFile file = request.getFile("file");
		String suKienJson = request.getParameter("suKien");

		// logic save hinh
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			if (file.isEmpty()) {
				return "Empty file!";
			}
			SuKien suKien = objectMapper.readValue(suKienJson, SuKien.class);
			suKien.setMaSuKien(null);

			byte[] bytes = file.getBytes();
			String tempFolderPath = System.getProperty("java.io.tmpdir");
			Path tempFilePath = Paths.get(tempFolderPath, file.getOriginalFilename());
			Files.write(tempFilePath, bytes);

			// Tạo đường dẫn cho file upload
			Resource resource = resourceLoader.getResource("classpath:static/images/");
			String uploadPath = resource.getFile().getAbsolutePath();

			File sourceFile = new File(tempFilePath.toFile().getAbsolutePath());
			File destinationFile = new File(uploadPath + "\\" + sourceFile.getName());
			File systemFile = new File(
					System.getProperty("user.dir") + "\\src\\main\\resources\\static\\images\\" + sourceFile.getName());

			// Kiểm tra xem tệp tin đích đã tồn tại hay chưa
			if (destinationFile.exists() && systemFile.exists()) {
				// Xóa tệp tin đích
				FileUtils.forceDelete(destinationFile);
				FileUtils.forceDelete(systemFile);
			}
			FileUtils.copyFile(sourceFile, destinationFile);
			FileUtils.copyFile(sourceFile, systemFile);

			service.saveSuKien(suKien);

			return "SuccessFully";

		} catch (Exception e) {
			e.printStackTrace();
			return "upload fail";
		}
	}

	@PutMapping("/")
	public String updateSuKien(MultipartHttpServletRequest request) {

		MultipartFile file = request.getFile("file");
		String suKienJson = request.getParameter("suKien");

		// logic save hinh
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			SuKien suKien = objectMapper.readValue(suKienJson, SuKien.class);
			suKien.setMaSuKien(suKien.getMaSuKien());
			
			if(file != null) {
				byte[] bytes = file.getBytes();
				String tempFolderPath = System.getProperty("java.io.tmpdir");
				Path tempFilePath = Paths.get(tempFolderPath, file.getOriginalFilename());
				Files.write(tempFilePath, bytes);
				
				// Tạo đường dẫn cho file upload
				Resource resource = resourceLoader.getResource("classpath:static/images/");
				String uploadPath = resource.getFile().getAbsolutePath();
				
				File sourceFile = new File(tempFilePath.toFile().getAbsolutePath());
				File destinationFile = new File(uploadPath + "\\" + sourceFile.getName());
				File systemFile = new File(
						System.getProperty("user.dir") + "\\src\\main\\resources\\static\\images\\" + sourceFile.getName());
				
				// Kiểm tra xem tệp tin đích đã tồn tại hay chưa
				if (destinationFile.exists() && systemFile.exists()) {
					// Xóa tệp tin đích
					FileUtils.forceDelete(destinationFile);
					FileUtils.forceDelete(systemFile);
				}
				FileUtils.copyFile(sourceFile, destinationFile);
				FileUtils.copyFile(sourceFile, systemFile);				
			}

			service.updateSuKien(suKien);
			return "SuccessFully";
		} catch (Exception e) {
			e.printStackTrace();
			return "upload fail";
		}
	}

	@DeleteMapping("/delete/{id}")
	public void deleteSukien(@PathVariable(name = "id") long id) {
		service.deleteSuKien(id);
	}
}
