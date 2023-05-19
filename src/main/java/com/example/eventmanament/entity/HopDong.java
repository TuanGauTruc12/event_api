package com.example.eventmanament.entity;

import java.sql.Date;

public class HopDong {
	private String maHopDong;
	private Date thoiGianToChuc;
	private String diaDiemToChuc;
	private int tienCoc;
	private Date ngayLayHopDong;
	private Date thoiGianKetThuc;
	private String maNhanVien;
	private int maKhachHang;
	private int maSuKien;
	private int soLuongKhachMoi;
	private String tenToChuc;
	
	public HopDong() {
	}
	
	public HopDong(String maHopDong, Date thoiGianToChuc, String diaDiemToChuc, int tienCoc, Date ngayLayHopDong,
			Date thoiGianKetThuc, String maNhanVien, int maKhachHang, int maSuKien, int soLuongKhachMoi,
			String tenToChuc) {
		this.maHopDong = maHopDong;
		this.thoiGianToChuc = thoiGianToChuc;
		this.diaDiemToChuc = diaDiemToChuc;
		this.tienCoc = tienCoc;
		this.ngayLayHopDong = ngayLayHopDong;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.maNhanVien = maNhanVien;
		this.maKhachHang = maKhachHang;
		this.maSuKien = maSuKien;
		this.soLuongKhachMoi = soLuongKhachMoi;
		this.tenToChuc = tenToChuc;
	}
	
	public String getMaHopDong() {
		return maHopDong;
	}
	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}
	public Date getThoiGianToChuc() {
		return thoiGianToChuc;
	}
	public void setThoiGianToChuc(Date thoiGianToChuc) {
		this.thoiGianToChuc = thoiGianToChuc;
	}
	public String getDiaDiemToChuc() {
		return diaDiemToChuc;
	}
	public void setDiaDiemToChuc(String diaDiemToChuc) {
		this.diaDiemToChuc = diaDiemToChuc;
	}
	public int getTienCoc() {
		return tienCoc;
	}
	public void setTienCoc(int tienCoc) {
		this.tienCoc = tienCoc;
	}
	public Date getNgayLayHopDong() {
		return ngayLayHopDong;
	}
	public void setNgayLayHopDong(Date ngayLayHopDong) {
		this.ngayLayHopDong = ngayLayHopDong;
	}
	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}
	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
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
	public int getMaSuKien() {
		return maSuKien;
	}
	public void setMaSuKien(int maSuKien) {
		this.maSuKien = maSuKien;
	}
	public int getSoLuongKhachMoi() {
		return soLuongKhachMoi;
	}
	public void setSoLuongKhachMoi(int soLuongKhachMoi) {
		this.soLuongKhachMoi = soLuongKhachMoi;
	}
	public String getTenToChuc() {
		return tenToChuc;
	}
	public void setTenToChuc(String tenToChuc) {
		this.tenToChuc = tenToChuc;
	}
}
