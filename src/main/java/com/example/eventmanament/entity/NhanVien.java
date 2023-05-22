package com.example.eventmanament.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "NHANVIEN")
public class NhanVien {

	@Id
	@Column(name = "MANV")
	private String maNhanVien;

	@Column(name = "HOTENNV")
	private String tenNhanVien;

	@Column(name = "CHUCVU")
	private String chucVu;

	@Column(name = "SDTNV")
	private String soDienThoai;

	@OneToMany(mappedBy = "nhanVien")
	private Set<HoaDon> hoaDons = new HashSet<>();

	@OneToMany(mappedBy = "nhanVien")
	private Set<HopDong> hopDongs = new HashSet<>();

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public Set<HoaDon> getHoaDons() {
		return hoaDons;
	}

	public void setHoaDons(Set<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}

	public Set<HopDong> getHopDongs() {
		return hopDongs;
	}

	public void setHopDongs(Set<HopDong> hopDongs) {
		this.hopDongs = hopDongs;
	}
}
