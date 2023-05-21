package com.example.eventmanament.entity;

import java.sql.Date;

import jakarta.persistence.Table;

//@Table(name = "CHITIETDV")
public class ChiTietDichVu {
	private int maHopDong;
	private int maDichVu;
	private Date ngaySuDung;
	private int soLuongDichVua;
	
	public ChiTietDichVu() {
	}
	
	public ChiTietDichVu(int maHopDong, int maDichVu, Date ngaySuDung, int soLuongDichVua) {
		this.maHopDong = maHopDong;
		this.maDichVu = maDichVu;
		this.ngaySuDung = ngaySuDung;
		this.soLuongDichVua = soLuongDichVua;
	}

	public int getMaHopDong() {
		return maHopDong;
	}
	public void setMaHopDong(int maHopDong) {
		this.maHopDong = maHopDong;
	}
	public int getMaDichVu() {
		return maDichVu;
	}
	public void setMaDichVu(int maDichVu) {
		this.maDichVu = maDichVu;
	}
	public Date getNgaySuDung() {
		return ngaySuDung;
	}
	public void setNgaySuDung(Date ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}
	public int getSoLuongDichVua() {
		return soLuongDichVua;
	}
	public void setSoLuongDichVua(int soLuongDichVua) {
		this.soLuongDichVua = soLuongDichVua;
	}
}
