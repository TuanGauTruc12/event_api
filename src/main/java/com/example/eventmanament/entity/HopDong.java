package com.example.eventmanament.entity;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "HOPDONG")
public class HopDong {

	@Id
	@GeneratedValue
	@Column(name = "MAHD")
	private String maHopDong;

	@Column(name = "THOIGIANTC")
	private Date thoiGianToChuc;

	@Column(name = "DIADIEMTC")
	private String diaDiemToChuc;

	@Column(name = "TIENCOC")
	private int tienCoc;

	@Column(name = "NGAYLAPHD")
	private Date ngayLayHopDong;

	@Column(name = "THOIGIANKETTHUC")
	private Date thoiGianKetThuc;

	@Column(name = "SOLUONGKHACHMOI")
	private int soLuongKhachMoi;

	@Column(name = "TENTOCHUC")
	private String tenToChuc;

	@ManyToOne
	@JoinColumn(name = "MANV")
	private NhanVien nhanVien;

	@ManyToOne
	@JoinColumn(name = "MAKH")
	private KhachHang khachHang;

	@ManyToOne
	@JoinColumn(name = "MASK")
	private SuKien suKien;
	

    @OneToMany(mappedBy = "hopDong")
    private Set<ChiTietDichVu> chiTietDVs;
    
	
	public String getMaHopDong() {
		return maHopDong;
	}

	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}

	public Date getThoiGianToChuc() {
		return thoiGianToChuc;
	}

	public void setThoiGianToChuc(Date thoiGianToChuc) {
		this.thoiGianToChuc = thoiGianToChuc;
	}

	public String getDiaDiemToChuc() {
		return diaDiemToChuc;
	}

	public void setDiaDiemToChuc(String diaDiemToChuc) {
		this.diaDiemToChuc = diaDiemToChuc;
	}

	public int getTienCoc() {
		return tienCoc;
	}

	public void setTienCoc(int tienCoc) {
		this.tienCoc = tienCoc;
	}

	public Date getNgayLayHopDong() {
		return ngayLayHopDong;
	}

	public void setNgayLayHopDong(Date ngayLayHopDong) {
		this.ngayLayHopDong = ngayLayHopDong;
	}

	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
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
}
