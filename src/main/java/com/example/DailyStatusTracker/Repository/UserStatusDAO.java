package com.example.DailyStatusTracker.Repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.example.DailyStatusTracker.Model.UserStatusModel;

@Component
public class UserStatusDAO{

	@Autowired
	private UserStatus repo;
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public UserStatusModel saveStatus(UserStatusModel userStatusData) {
	
		return repo.save(userStatusData);
	}
	
	public UserStatusModel getStatusData(String userId) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return (UserStatusModel) mongoTemplate.findAll(UserStatusModel.class);
	}
}
