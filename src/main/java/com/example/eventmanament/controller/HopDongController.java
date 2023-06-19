package com.example.eventmanament.controller;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.eventmanament.dto.ContractDTIO;
import com.example.eventmanament.dto.ContractItemDTO;
import com.example.eventmanament.dto.DichVuDTO;
import com.example.eventmanament.dto.EventDTO;
import com.example.eventmanament.dto.KhachHangDTO;
import com.example.eventmanament.dto.ServiceDTO;
import com.example.eventmanament.entity.ChiTietDichVu;
import com.example.eventmanament.entity.HopDong;
import com.example.eventmanament.entity.KhachHang;
import com.example.eventmanament.entity.SuKien;
import com.example.eventmanament.repository.KhachHangRepository;
import com.example.eventmanament.service.ChiTietDichVuService;
import com.example.eventmanament.service.HopDongService;
import com.example.eventmanament.service.KhachHangService;
import com.example.eventmanament.service.SuKienService;

@RestController
@RequestMapping("/contract")
public class HopDongController {

	@Autowired
	private HopDongService service;

	@Autowired
	private KhachHangService khachHangService;

	@Autowired
	private SuKienService suKienService;

	@Autowired
	private ChiTietDichVuService chiTietDichVuService;

	@GetMapping("/getAllByKhachHang/{maUser}")
	public List<ContractDTIO> getAllHopDong(@PathVariable(name = "maUser") int maUser) {
		List<HopDong> hopDongs = service.getHopDongByIDKhachHangs(maUser);
		List<ContractDTIO> list = new ArrayList<>();
		if (hopDongs.size() == 0) {
			return list;
		}
		for (HopDong hopDong : hopDongs) {
			list.add(new ContractDTIO(hopDong.getMaHopDong(), hopDong.getSuKien().getTenSuKien(),
					hopDong.getNgayLapHopDong(), hopDong.isTrangThai()));
		}
		return list;
	}

	@PostMapping("/")
	public void saveHopDong(@RequestParam("soLuongKhachMoi") int soLuong, @RequestParam("tenToChuc") String tenToChuc,
			@RequestParam("MAKH") int MAKH, @RequestParam("MASK") long MASK, @RequestParam("dichVus") String dichVus,
			@RequestParam("kinhPhi") int kinhPhi) {
		java.util.Date currentDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
		Gson gson = new Gson();
		List<DichVuDTO> dichVusList = gson.fromJson(dichVus, new TypeToken<List<DichVuDTO>>() {
		}.getType());
		SuKien suKien = suKienService.getSuKienById(MASK);
		KhachHang khachHang = khachHangService.findKhachHangByID(MAKH);
		HopDong hopDong = new HopDong();
		hopDong.setKhachHang(khachHang);
		hopDong.setSuKien(suKien);
		hopDong.setNgayLapHopDong(sqlDate);
		hopDong.setKinhPhi(kinhPhi);
		hopDong.setSoLuongKhachMoi(soLuong);
		hopDong.setTenToChuc(tenToChuc);
		hopDong.setTienCoc(0);
		hopDong.setTrangThai(false);

		HopDong hopDongTemp = service.saveHopDong(hopDong);
		for (DichVuDTO dichVuDTO : dichVusList) {
			chiTietDichVuService.save(dichVuDTO.getMaDichVu(), hopDongTemp, dichVuDTO.getSoLuong(),
					dichVuDTO.getGhiChu(), dichVuDTO.getTongTien());
		}
	}

	@GetMapping("/getByID/{id}")
	public ContractItemDTO getHopDongByID(@PathVariable int id) {
		HopDong hopDong = service.getHopDongById(id);
		KhachHangDTO customer = new KhachHangDTO(hopDong.getKhachHang().getTenKhachHang(), hopDong.getKhachHang().getEmail(), hopDong.getKhachHang().getSoDienThoai());
		EventDTO event = new EventDTO(hopDong.getSuKien().getTenSuKien(), hopDong.getSuKien().getNgayToChuc(), hopDong.getSuKien().getNgayKetThuc());
		List<ServiceDTO> services = new ArrayList<>();
		List<ChiTietDichVu> chiTietDichVus = chiTietDichVuService.getDetailServiceByIDContract(hopDong);
		int totalPrice = 0;
		for (ChiTietDichVu chiTietDichVu : chiTietDichVus) {
			services.add(new ServiceDTO(chiTietDichVu.getDichVu().getTenDichVu(), chiTietDichVu.getDichVu().getGia(), chiTietDichVu.getSoLuongDichVuCan(), chiTietDichVu.getTongTien(), chiTietDichVu.getGhiChu(), chiTietDichVu.getDichVu().getDonViTinh()));
			totalPrice += chiTietDichVu.getTongTien();
		}
		ContractItemDTO contract = new ContractItemDTO(customer, event, services, hopDong.getTenToChuc(), hopDong.getSoLuongKhachMoi(), hopDong.getKinhPhi(),totalPrice);
		return contract;
	}

	@GetMapping("/updateStatus/{idHopDong}")
	public void updateStatus(@PathVariable int idHopDong) {
		HopDong hopDong = service.getHopDongById(idHopDong);
		hopDong.setTrangThai(true);
	}
}
