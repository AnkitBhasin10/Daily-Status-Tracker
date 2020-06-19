package com.example.DailyStatusTracker.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DailyStatusTracker.Model.UserLoginAndRegister;
import com.example.DailyStatusTracker.Repository.LoginAndRegisterRepositoryDAO;


@Service
public class LoginAndRegisterService {
	
	@Autowired
	private LoginAndRegisterRepositoryDAO repo;

	public UserLoginAndRegister userLoginValidation(String email) {
		
		return repo.getLoginAuthorization(email);
	}
	
	public UserLoginAndRegister userRegistration(UserLoginAndRegister userRegister) {
		
		if(userRegister.getUserId() == null) {
			userRegister.setUserId(UUID.randomUUID().toString());
		}
		return repo.createUser(userRegister);
	}

}
