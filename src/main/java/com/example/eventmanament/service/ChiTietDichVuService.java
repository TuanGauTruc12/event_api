package com.example.eventmanament.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanament.dto.ServiceDTO;
import com.example.eventmanament.entity.ChiTietDichVu;
import com.example.eventmanament.entity.ChiTietDichVuId;
import com.example.eventmanament.entity.DichVu;
import com.example.eventmanament.entity.HopDong;
import com.example.eventmanament.repository.ChiTietDichVuRepository;
import com.example.eventmanament.repository.DichVuRepository;
import com.example.eventmanament.repository.HopDongRepository;

@Service
public class ChiTietDichVuService {
	@Autowired
	private ChiTietDichVuRepository repository;
	
	@Autowired
	private DichVuService dichVuService;
	
	@Autowired
	private HopDongService hopDongService;
	
	public List<ChiTietDichVu> getDetailServiceByIDContract(HopDong hopDong){
		return repository.findAllByHopDong(hopDong);
	}
	
	//save
	public void save(int maDichVu, HopDong hopDong, int soLuong, String ghiChu, double tongTien) {
		DichVu dichVu = dichVuService.getDichVuById(maDichVu);
		ChiTietDichVu chiTietDichVu = new ChiTietDichVu();
		chiTietDichVu.setHopDong(hopDong);
		chiTietDichVu.setDichVu(dichVu);
		chiTietDichVu.setGhiChu(ghiChu);
        java.util.Date currentDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
		chiTietDichVu.setNgaySuDung(sqlDate);
		chiTietDichVu.setTongTien(tongTien);
	 	repository.save(chiTietDichVu);
	}
}
