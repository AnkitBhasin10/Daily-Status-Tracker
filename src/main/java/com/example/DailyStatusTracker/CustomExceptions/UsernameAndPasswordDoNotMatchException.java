package com.example.DailyStatusTracker.CustomExceptions;

public class UsernameAndPasswordDoNotMatchException extends Exception{
	
	public UsernameAndPasswordDoNotMatchException(String message) {
		super(message);
	}

}
