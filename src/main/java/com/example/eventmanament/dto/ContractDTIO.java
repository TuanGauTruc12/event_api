package com.example.eventmanament.dto;

import java.sql.Date;

public class ContractDTIO {
	private int maHopDong;
	private String tenHopDong;
	private Date ngayLapHopDong;
	private boolean tinhTrang;
	
	public ContractDTIO(int maHopDong, String tenHopDong, Date ngayLapHopDong, boolean tinhTrang) {
		this.maHopDong = maHopDong;
		this.tenHopDong = tenHopDong;
		this.ngayLapHopDong = ngayLapHopDong;
		this.tinhTrang = tinhTrang;
	}
	public int getMaHopDong() {
		return maHopDong;
	}
	public void setMaHopDong(int maHopDong) {
		this.maHopDong = maHopDong;
	}
	public String getTenHopDong() {
		return tenHopDong;
	}
	public void setTenHopDong(String tenHopDong) {
		this.tenHopDong = tenHopDong;
	}
	public Date getNgayLapHopDong() {
		return ngayLapHopDong;
	}
	public void setNgayLapHopDong(Date ngayLapHopDong) {
		this.ngayLapHopDong = ngayLapHopDong;
	}
	public boolean isTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
}
