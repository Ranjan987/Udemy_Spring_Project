package com.practiceActivity7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springdemo.Coach;

@Configuration
public class SoccerConfig 
{
	// define bean for our soccer fortune service
	
	@Bean
	public SoccerFortuneService soccerFortuneService()
	{
		return new SoccerFortuneService();
	}
	//define bean for our soccer coach and inject dependency
	@Bean
	public Coach soccerCoach()
	{
		return new SoccerCoach(soccerFortuneService());
	}
}
