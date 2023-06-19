package com.example.eventmanament.dto;

import java.util.List;

public class ContractItemDTO {
	private KhachHangDTO customer;
	private EventDTO event;
	private List<ServiceDTO> services;
	private String nameCompany;
	private int numberOfGuest;
	private int expense;
	private int totalPrice;
	
	public ContractItemDTO(KhachHangDTO customer, EventDTO event, List<ServiceDTO> services, String nameCompany,
			int numberOfGuest, int expense, int totalPrice) {
		this.customer = customer;
		this.event = event;
		this.services = services;
		this.nameCompany = nameCompany;
		this.numberOfGuest = numberOfGuest;
		this.expense = expense;
		this.totalPrice = totalPrice;
	}
	
	public KhachHangDTO getCustomer() {
		return customer;
	}
	public void setCustomer(KhachHangDTO customer) {
		this.customer = customer;
	}
	public EventDTO getEvent() {
		return event;
	}
	public void setEvent(EventDTO event) {
		this.event = event;
	}
	public List<ServiceDTO> getServices() {
		return services;
	}
	public void setServices(List<ServiceDTO> services) {
		this.services = services;
	}
	public String getNameCompany() {
		return nameCompany;
	}
	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}
	public int getNumberOfGuest() {
		return numberOfGuest;
	}
	public void setNumberOfGuest(int numberOfGuest) {
		this.numberOfGuest = numberOfGuest;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}
