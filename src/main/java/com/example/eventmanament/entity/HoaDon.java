package com.example.eventmanament.entity;

import java.sql.Date;

public class HoaDon {
	private int maHoaDon;
	private Date ngayLap;
	private int tongTien;
	private String maNhanVien;
	private int maKhachHang;
	private String maHopDong;

	public HoaDon() {
	}

	public HoaDon(int maHoaDon, Date ngayLap, int tongTien, String maNhanVien, int maKhachHang, String maHopDong) {
		this.maHoaDon = maHoaDon;
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
		this.maNhanVien = maNhanVien;
		this.maKhachHang = maKhachHang;
		this.maHopDong = maHopDong;
	}

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public int getTongTien() {
		return tongTien;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public int getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getMaHopDong() {
		return maHopDong;
	}

	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}
}
