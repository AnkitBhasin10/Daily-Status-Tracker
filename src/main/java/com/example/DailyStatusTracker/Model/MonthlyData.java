package com.example.DailyStatusTracker.Model;

import java.util.List;

public class MonthlyData {

	private String monthAndyear;
	private List<UserStatusDataModel> userStatusData;

	public List<UserStatusDataModel> getUserStatusData() {
		return userStatusData;
	}

	public void setUserStatusData(List<UserStatusDataModel> userStatusData) {
		this.userStatusData = userStatusData;
	}

	public String getMonthAndyear() {
		return monthAndyear;
	}

	public void setMonthAndyear(String monthAndyear) {
		this.monthAndyear = monthAndyear;
	}
}
