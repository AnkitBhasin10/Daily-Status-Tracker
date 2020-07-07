package com.example.DailyStatusTracker.Model;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.stereotype.Component;

public class UserStatusDataModel {

	private String date;
	private String status;

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "UserStatus[date=" + date + ", status=" + status +"]";
	}
}
