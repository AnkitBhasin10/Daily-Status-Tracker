package com.example.DailyStatusTracker.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.DailyStatusTracker.Model.UserStatusModel;

public interface UserStatus extends MongoRepository<UserStatusModel,String>{

}
