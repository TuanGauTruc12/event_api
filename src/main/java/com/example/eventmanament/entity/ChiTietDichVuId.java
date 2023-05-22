package com.example.eventmanament.entity;

import java.io.Serializable;

public class ChiTietDichVuId implements Serializable {
    private DichVu dichVu;
    private HopDong hopDong;
    
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
