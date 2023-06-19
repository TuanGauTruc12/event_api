package com.example.eventmanament.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanament.dto.ContractDTIO;
import com.example.eventmanament.entity.HopDong;
import com.example.eventmanament.repository.HopDongRepository;

@Service
public class HopDongService {
	@Autowired
	private HopDongRepository repository;
	
	//add hop dong
	public HopDong saveHopDong(HopDong hopDong) {
		return repository.save(hopDong);
	}
	
	//Get All
	public List<HopDong> getHopDongByIDKhachHangs(int MAKH) {
		return repository.findByMaKHDistinct(MAKH);
	}

	//get one
	public HopDong getHopDongById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	//Cập nhật hợp đồng
	public void updateHopDong(HopDong hopDong) {
		HopDong existinghopDong = repository.findById(hopDong.getMaHopDong()).orElse(null);
		existinghopDong.setKhachHang(hopDong.getKhachHang());
		existinghopDong.setNhanVien(hopDong.getNhanVien());
		existinghopDong.setSoLuongKhachMoi(hopDong.getSoLuongKhachMoi());
		existinghopDong.setNgayLapHopDong(hopDong.getNgayLapHopDong());
		existinghopDong.setSuKien(hopDong.getSuKien());
		existinghopDong.setTenToChuc(hopDong.getTenToChuc());
		existinghopDong.setTienCoc(hopDong.getTienCoc());
		existinghopDong.setTrangThai(hopDong.isTrangThai());
		repository.save(existinghopDong);
	}
}
