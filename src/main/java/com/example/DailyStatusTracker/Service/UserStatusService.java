package com.example.DailyStatusTracker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DailyStatusTracker.Model.UserStatusModel;
import com.example.DailyStatusTracker.Repository.UserStatusDAO;

@Service
public class UserStatusService {

	@Autowired
	private UserStatusDAO repo;

	public UserStatusModel saveUserStatusData(UserStatusModel userStatusData) {
		
		return repo.saveStatus(userStatusData);
	}
	
	public UserStatusModel getUserStatusData(String userId) {
		
		if(userId != null) {
			return repo.getStatusData(userId);
		}
		return null;
	}
}
