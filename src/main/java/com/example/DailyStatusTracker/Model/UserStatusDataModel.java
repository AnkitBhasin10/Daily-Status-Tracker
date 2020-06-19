package com.example.DailyStatusTracker.Model;

import java.util.Date;

public class UserStatusDataModel {

	private Date date;
	private String status;

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
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
