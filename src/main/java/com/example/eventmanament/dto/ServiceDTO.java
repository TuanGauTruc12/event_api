package com.example.eventmanament.dto;

public class ServiceDTO {
	private String nameService;
	private double priceService;
	private int quantityService;
	private double totalPrice;
	private String contentService;
	private String unitService;
	
	public ServiceDTO(String nameService, double priceService, int quantityService, double totalPrice,
			String contentService, String unitService) {
		this.nameService = nameService;
		this.priceService = priceService;
		this.quantityService = quantityService;
		this.totalPrice = totalPrice;
		this.contentService = contentService;
		this.unitService = unitService;
	}
	
	public String getNameService() {
		return nameService;
	}
	public void setNameService(String nameService) {
		this.nameService = nameService;
	}
	public double getPriceService() {
		return priceService;
	}
	public void setPriceService(double priceService) {
		this.priceService = priceService;
	}
	public int getQuantityService() {
		return quantityService;
	}
	public void setQuantityService(int quantityService) {
		this.quantityService = quantityService;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getContentService() {
		return contentService;
	}
	public void setContentService(String contentService) {
		this.contentService = contentService;
	}
	public String getUnitService() {
		return unitService;
	}
	public void setUnitService(String unitService) {
		this.unitService = unitService;
	}
}
