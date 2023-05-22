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
	private int soLuongDichCan;

	public Date getNgaySuDung() {
		return ngaySuDung;
	}

	public void setNgaySuDung(Date ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}

	public int getSoLuongDichCan() {
		return soLuongDichCan;
	}

	public void setSoLuongDichCan(int soLuongDichCan) {
		this.soLuongDichCan = soLuongDichCan;
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
