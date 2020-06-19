package com.example.DailyStatusTracker.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.DailyStatusTracker.Model.UserLoginAndRegister;

public interface LoginAndRegisterRepository extends MongoRepository<UserLoginAndRegister,String>{

}
