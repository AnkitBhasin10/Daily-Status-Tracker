package com.example.DailyStatusTracker.Model;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class UserLogin {
	
	private UUID userId;
	private String userName;
	private String password;
	
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
	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

}
