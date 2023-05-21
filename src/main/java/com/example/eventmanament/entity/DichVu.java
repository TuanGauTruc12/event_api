package com.example.eventmanament.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DICHVU")
public class DichVu {
	@Id
	@GeneratedValue
	@Column(name = "MADV")
	private int maDichVu;

	@Column(name = "TENDV")
	private String tenDichVu;

	@Column(name = "SLCOSAN")
	private int soLuong;

	@Column(name = "DVT")
	private String donViTinh;

	@Column(name = "GIA")
	private int gia;

	public DichVu() {
	}

	public DichVu(int maDichVu, String tenDichVu, int soLuong, String donViTinh, int gia) {
		this.maDichVu = maDichVu;
		this.tenDichVu = tenDichVu;
		this.soLuong = soLuong;
		this.donViTinh = donViTinh;
		this.gia = gia;
	}

	public int getMaDichVu() {
		return maDichVu;
	}

	public void setMaDichVu(int maDichVu) {
		this.maDichVu = maDichVu;
	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}
}
