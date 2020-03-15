package com.example.DailyStatusTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.DailyStatusTracker")
public class DailyStatusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyStatusTrackerApplication.class, args);
	}

}
