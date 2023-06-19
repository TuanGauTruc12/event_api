package com.example.eventmanament.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "KHACHHANG")
public class KhachHang {
	@Id
	@GeneratedValue
	@Column(name = "MAKH")
	private int maKhachHang;

	@Column(name = "HOTENKH")
	private String tenKhachHang;

	@Column(name = "SDT")
	private String soDienThoai;

	@Column(name = "DIACHIKH")
	private String diaChi;

	@Column(name = "EMAILKH")
	private String email;

	@Column(name = "PASS")
	private String password;

	@Column(name = "HINHANH")
	private String image;
	
	@OneToMany(mappedBy = "khachHang")
	private Set<HopDong> hopDongs = new HashSet<>();
	
	public int getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(int maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public Set<HopDong> getHopDongs() {
		return hopDongs;
	}
	
	public void setHopDongs(Set<HopDong> hopDongs) {
		this.hopDongs = hopDongs;
	}
}
