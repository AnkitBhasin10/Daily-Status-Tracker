package com.example.DailyStatusTracker.Repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.example.DailyStatusTracker.Model.MonthlyData;
import com.example.DailyStatusTracker.Model.UserStatusDataModel;
import com.example.DailyStatusTracker.Model.UserStatusModel;
import com.mongodb.client.result.UpdateResult;

@Component
public class UserStatusDAO{

	@Autowired
	private UserStatus repo;
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public void saveStatus(UserStatusModel userStatusData) {
		
		
		
		Criteria criteria = new Criteria();
		
		for(int i=0;i<userStatusData.getMonthly().size();i++) {
			
			
		for(int j=0;j<userStatusData.getMonthly().get(i).getUserStatusData().size();j++) {
			Query query = new Query();
			criteria = Criteria.where("monthAndYear").is(userStatusData.getMonthly().get(i).getMonthAndYear()).andOperator(
					Criteria.where("date").is(userStatusData.getMonthly().get(i).getUserStatusData().get(j).getDate()));
		
			Update update = new Update();
			update.set("status", userStatusData.getMonthly().get(i).getUserStatusData().get(j).getStatus());
			query.addCriteria(criteria);
			mongoTemplate.upsert(query, update, UserStatusModel.class);
		}
		}		
		
		repo.save(userStatusData);
	}
	
	public List<UserStatusModel> getStatusData(String userId) {
		
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return mongoTemplate.findAll(UserStatusModel.class);
	}
}
