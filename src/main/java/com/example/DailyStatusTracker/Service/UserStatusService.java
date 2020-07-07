package com.example.DailyStatusTracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DailyStatusTracker.Model.UserStatusModel;
import com.example.DailyStatusTracker.Repository.UserStatusDAO;

@Service
public class UserStatusService {

	@Autowired
	private UserStatusDAO repo;

	public void saveUserStatusData(UserStatusModel userStatusData) {
		
		repo.saveStatus(userStatusData);
	}
	
	public List<UserStatusModel> getUserStatusData(String userId) {
		
		if(userId != null) {
			return repo.getStatusData(userId);
		}
		return null;
	}
}
