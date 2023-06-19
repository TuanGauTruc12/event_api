package com.example.eventmanament.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CHITIETDV")
@IdClass(ChiTietDichVuId.class)
public class ChiTietDichVu {
	@Id
	@ManyToOne
	@JoinColumn(name = "MADV")
	private DichVu dichVu;

	@Id
	@ManyToOne
	@JoinColumn(name = "MAHD")
	private HopDong hopDong;

	@Column(name = "NGAYSD")
	private Date ngaySuDung;

	@Column(name = "SLDVCAN")
	private int soLuongDichVuCan;

	@Column(name = "GHICHU")
	private String ghiChu;
	
	@Column(name = "TONGTIEN")
	private double tongTien;
	
	public double getTongTien() {
		return tongTien;
	}
	
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public Date getNgaySuDung() {
		return ngaySuDung;
	}

	public void setNgaySuDung(Date ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}

	public int getSoLuongDichVuCan() {
		return soLuongDichVuCan;
	}

	public void setSoLuongDichVuCan(int soLuongDichVuCan) {
		this.soLuongDichVuCan = soLuongDichVuCan;
	}

	public DichVu getDichVu() {
		return dichVu;
	}

	public void setDichVu(DichVu dichVu) {
		this.dichVu = dichVu;
	}

	public HopDong getHopDong() {
		return hopDong;
	}

	public void setHopDong(HopDong hopDong) {
		this.hopDong = hopDong;
	}
}
