package com.example.DailyStatusTracker.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="UserStatus")
public class UserStatusModel {
	
	@Id
	private String userId;
	
	private List<MonthlyData> monthly;

	public List<MonthlyData> getMonthly() {
		return monthly;
	}

	public void setMonthly(List<MonthlyData> monthly) {
		this.monthly = monthly;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
