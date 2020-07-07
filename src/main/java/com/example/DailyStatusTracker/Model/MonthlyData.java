package com.example.DailyStatusTracker.Model;

import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.stereotype.Component;

public class MonthlyData {

	private String monthAndYear;
	private List<UserStatusDataModel> userStatusData;

	public List<UserStatusDataModel> getUserStatusData() {
		return userStatusData;
	}

	public void setUserStatusData(List<UserStatusDataModel> userStatusData) {
		this.userStatusData = userStatusData;
	}

	public String getMonthAndYear() {
		return monthAndYear;
	}

	public void setMonthAndYear(String monthAndYear) {
		this.monthAndYear = monthAndYear;
	}

	
}
