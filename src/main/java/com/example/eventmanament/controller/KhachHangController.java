package com.example.eventmanament.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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

	@Autowired
	private ResourceLoader resourceLoader;
	
	//
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password) {
		KhachHang khachHang = service.login(email, password);
		if (khachHang == null) {
			return new ResponseEntity<String>("", HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			UserDTO dto = new UserDTO(khachHang.getMaKhachHang(), khachHang.getTenKhachHang(), khachHang.getImage(),
					khachHang.getEmail(), khachHang.getSoDienThoai());
			return new ResponseEntity<String>(dto.toString(), HttpStatus.OK);
		}
	}

	@PutMapping(name = "/")
	public void update(MultipartHttpServletRequest request) {
		
		int id_user = Integer.parseInt(request.getParameter("id_user"));
		String phoneNumber = request.getParameter("phoneNumber");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		MultipartFile file = request.getFile("file");
		
		
		try {
			KhachHang khachHang = service.findKhachHangByID(id_user);
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
				khachHang.setImage(file.getOriginalFilename());
			}
			khachHang.setDiaChi(address);
			khachHang.setPassword(password);
			khachHang.setSoDienThoai(phoneNumber);
			service.updateKhachHang(khachHang);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
