package com.example.DailyStatusTracker.Model;

import java.util.UUID;

public class UserRegister {

	private UUID userId;
	private String userName;
	private String password;
	private String designation;
	private String companyName;
	
	public UUID getUserId() {
		return userId;
	}
	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "UserRegister [userId=" + userId + ", userName=" + userName + ", password=" + password + ", designation="
				+ designation + ", companyName=" + companyName + "]";
	}
	
}
