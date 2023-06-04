package com.example.eventmanament.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "LOAISUKIEN")
public class LoaiSuKien {
	@Id
	@Column(name = "MaLoaiSuKien")
	@GeneratedValue
	private int maLoaiSuKien;
	
	@Column(name = "TenLoaiSuKien")
	private String tenLoaiSuKien;
	
	@OneToMany(mappedBy = "loaiSuKien")
	private Set<SuKien> suKiens = new HashSet<>();

	public int getMaLoaiSuKien() {
		return maLoaiSuKien;
	}

	public void setMaLoaiSuKien(int maLoaiSuKien) {
		this.maLoaiSuKien = maLoaiSuKien;
	}

	public String getTenLoaiSuKien() {
		return tenLoaiSuKien;
	}

	public void setTenLoaiSuKien(String tenLoaiSuKien) {
		this.tenLoaiSuKien = tenLoaiSuKien;
	}
}
