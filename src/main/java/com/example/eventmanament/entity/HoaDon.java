package com.example.eventmanament.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "HOADONTT")
public class HoaDon {
	@Id
	@GeneratedValue
	@Column(name = "MATT")
	private int maHoaDon;
	
	@Column(name = "NGAYLAP")
	private Date ngayLap;
	
	@Column(name = "TONGTIEN")
	private int tongTien;
	
	@ManyToOne
    @JoinColumn(name = "MANV")
	private NhanVien nhanVien;
	
	@ManyToOne
    @JoinColumn(name = "MAKH")
	private KhachHang khachHang;
	
	@ManyToOne
    @JoinColumn(name = "hoaDons")
	private HopDong hopDong;

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

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public HopDong getHopDong() {
		return hopDong;
	}

	public void setHopDong(HopDong hopDong) {
		this.hopDong = hopDong;
	}
}
