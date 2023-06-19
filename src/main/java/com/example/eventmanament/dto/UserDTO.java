package com.example.eventmanament.dto;

public class UserDTO {
	private int maUser;
	private String user_name;
	private String image;
	private String email;
	private String phoneNumber;

	public UserDTO(int maUser, String user_name, String image, String email, String phoneNumber) {
		this.maUser = maUser;
		this.user_name = user_name;
		this.image = image;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getMaUser() {
		return maUser;
	}

	public void setMaUser(int maUser) {
		this.maUser = maUser;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "{\"maUser\":" + maUser + ", \"user_name\" :\"" + user_name + "\", \"image\":\"" + image
				+ "\", \"email\":\"" + email + "\", \"phoneNumber\": \"" + phoneNumber + "\"}";
	}
}
