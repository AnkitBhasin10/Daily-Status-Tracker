package com.example.DailyStatusTracker.Service;

import org.springframework.stereotype.Service;

@Service
public class LoginAndRegisterService {

	public boolean userLoginValidation(String email,String password) {
		//code to check from repository if username and password matches
		
		if(email.equalsIgnoreCase("ankit.original@gmail.com") && password.equalsIgnoreCase("123456")) {
			return true;
		}
		
		return false;
	}
}
