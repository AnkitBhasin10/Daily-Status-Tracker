package com.example.DailyStatusTracker.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.DailyStatusTracker.Model.UserLoginAndRegister;
import com.example.DailyStatusTracker.Model.UserStatusModel;
import com.example.DailyStatusTracker.Service.LoginAndRegisterService;
import com.example.DailyStatusTracker.Service.UserStatusService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginAndRegisterController {
	
	@Autowired
	LoginAndRegisterService lars;
	
	@PostMapping("/login")
	public UserLoginAndRegister userLogin(@RequestBody UserLoginAndRegister userLogin) {
		
		return lars.userLoginValidation(userLogin.getEmail());
	}
	
	@PostMapping("/register")
	public UserLoginAndRegister userRegistration(@RequestBody UserLoginAndRegister userRegister) {
		
		return lars.userRegistration(userRegister);
	}

}
