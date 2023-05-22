package com.example.eventmanament.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @OneToMany(mappedBy = "dichVu")
    private Set<ChiTietDichVu> chiTietDVs;

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
