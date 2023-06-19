package com.example.eventmanament.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "SUKIEN")
public class SuKien {
	@Id
	@Column(name = "MASK")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long maSuKien;

	@Column(name = "TENSK")
	private String tenSuKien;

	@Column(name = "HINHSK")
	private String hinhSuKien;

	@Column(name = "MOTASK")
	private String moTaSuKien;

	@Column(name = "NGAYTC")
	private String ngayToChuc;

	@Column(name = "NGAYKETTHUC")
	private String ngayKetThuc;
	
	@Column(name = "DIADIEM")
	private String diaDiem;

	@Column(name = "TIN")
	private String tin;

	@Column(name = "ANH")
	private String anh;

	@Column(name = "NOIDUNG")
	private String noiDung;

	@OneToMany(mappedBy = "suKien")
	private Set<HopDong> hopDongs = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "MALOAISK")
	private LoaiSuKien loaiSuKien;

	public LoaiSuKien getLoaiSuKien() {
		return loaiSuKien;
	}

	public void setLoaiSuKien(LoaiSuKien loaiSuKien) {
		this.loaiSuKien = loaiSuKien;
	}

	public String getNgayToChuc() {
		return ngayToChuc;
	}

	public void setNgayToChuc(String ngayToChuc) {
		this.ngayToChuc = ngayToChuc;
	}

	public String getNgayKetThuc() {
		return ngayKetThuc;
	}

	public void setNgayKetThuc(String ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}
	
	public String getDiaDiem() {
		return diaDiem;
	}

	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public Long getMaSuKien() {
		return maSuKien;
	}

	public void setMaSuKien(Long maSuKien) {
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
