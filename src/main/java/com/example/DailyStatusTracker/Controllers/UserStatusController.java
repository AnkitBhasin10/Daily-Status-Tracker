package com.example.DailyStatusTracker.Controllers;

import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DailyStatusTracker.Model.UserStatusModel;
import com.example.DailyStatusTracker.Service.UserStatusService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/status")
public class UserStatusController {

	@Autowired
	private UserStatusService userStatusService;
	
	@PostMapping("/saveStatus")
	public void saveStatus(@RequestBody UserStatusModel userStatus) {
		System.out.println(userStatus);
		userStatusService.saveUserStatusData(userStatus);
	}
	
	@PostMapping("/getUserStatusData")
	public List<UserStatusModel> getUserStatusData(@RequestBody String userId) {
		return userStatusService.getUserStatusData(userId);
	}
}
