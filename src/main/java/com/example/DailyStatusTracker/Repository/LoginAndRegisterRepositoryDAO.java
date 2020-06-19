package com.example.DailyStatusTracker.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import com.example.DailyStatusTracker.Model.UserLoginAndRegister;

@Component
public class LoginAndRegisterRepositoryDAO {

	@Autowired
	private LoginAndRegisterRepository repo;
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public UserLoginAndRegister createUser(UserLoginAndRegister userRegister) {
	
		return repo.insert(userRegister);
	}
	
	public UserLoginAndRegister getLoginAuthorization(String email) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(email));
		return mongoTemplate.findOne(query, UserLoginAndRegister.class);
	}
}
