package com.example.DailyStatusTracker.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DailyStatusTracker.Model.UserLogin;
import com.example.DailyStatusTracker.Service.LoginAndRegisterService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginAndRegisterController {
	
	@Autowired
	UserLogin user;
	@Autowired
	LoginAndRegisterService lars;

	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/login/{email}/{password}")
	public Boolean userLogin(@PathVariable(value="email") String email,@PathVariable(value="password") String password) {
		
		if(lars.userLoginValidation(email, password)) {
			return true;
		}
		
		return false;
	}
}
