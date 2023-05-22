package com.example.eventmanament.entity;

import java.util.HashSet;
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
@Table(name = "SUKIEN")
public class SuKien {
	@Id
	@GeneratedValue
	@Column(name = "MASK")
	private int maSuKien;

	@Column(name = "TENSK")
	private String tenSuKien;

	@Column(name = "HINHSK")
	private String hinhSuKien;

	@Column(name = "MOTASK")
	private String moTaSuKien;
	
	@OneToMany(mappedBy = "suKien")
	private Set<HopDong> suKiens = new HashSet<>();

	public int getMaSuKien() {
		return maSuKien;
	}

	public void setMaSuKien(int maSuKien) {
		this.maSuKien = maSuKien;
	}

	public String getTenSuKien() {
		return tenSuKien;
	}

	public void setTenSuKien(String tenSuKien) {
		this.tenSuKien = tenSuKien;
	}

	public String getHinhSuKien() {
		return hinhSuKien;
	}

	public void setHinhSuKien(String hinhSuKien) {
		this.hinhSuKien = hinhSuKien;
	}

	public String getMoTaSuKien() {
		return moTaSuKien;
	}

	public void setMoTaSuKien(String moTaSuKien) {
		this.moTaSuKien = moTaSuKien;
	}
}
