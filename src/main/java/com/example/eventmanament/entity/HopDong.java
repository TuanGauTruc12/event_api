package com.example.eventmanament.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "HOPDONG")
public class HopDong {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAHD")
	private int maHopDong;

	@Column(name = "TIENCOC")
	private int tienCoc;

	@Column(name = "NGAYLAPHD")
	private Date ngayLapHopDong;

	@Column(name = "SOLUONGKHACHMOI")
	private int soLuongKhachMoi;

	@Column(name = "TENTOCHUC", columnDefinition = "NVARCHAR(100)")
	private String tenToChuc;
	
	@Column(name = "KINHPHI")
	private int kinhPhi;
	
	@Column(name = "TRANGTHAI")
	private boolean trangThai;

	@ManyToOne(optional = true)
	@JsonBackReference
	@JoinColumn(name = "MANV")
	private NhanVien nhanVien;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "MAKH")
	private KhachHang khachHang;

	@ManyToOne
	@JoinColumn(name = "MASK")
	private SuKien suKien;
	
    @OneToMany(mappedBy = "hopDong")
    private Set<ChiTietDichVu> chiTietDVs = new HashSet<>();
    
	public int getMaHopDong() {
		return maHopDong;
	}

	public void setMaHopDong(int maHopDong) {
		this.maHopDong = maHopDong;
	}

	public int getTienCoc() {
		return tienCoc;
	}

	public void setTienCoc(int tienCoc) {
		this.tienCoc = tienCoc;
	}

	public Date getNgayLapHopDong() {
		return ngayLapHopDong;
	}

	public void setNgayLapHopDong(Date ngayLapHopDong) {
		this.ngayLapHopDong = ngayLapHopDong;
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

	public SuKien getSuKien() {
		return suKien;
	}

	public void setSuKien(SuKien suKien) {
		this.suKien = suKien;
	}
	
	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	
	public int getKinhPhi() {
		return kinhPhi;
	}
	
	public void setKinhPhi(int kinhPhi) {
		this.kinhPhi = kinhPhi;
	}
}
