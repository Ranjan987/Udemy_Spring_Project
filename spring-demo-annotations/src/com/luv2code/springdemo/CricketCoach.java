package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@Component
public class CricketCoach implements Coach
{
	
	// define my init method
	
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("inside of doMyStartStuff()");
	}
	
	// define my destory method
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println("inside of doMyCleanupStuff()");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Do the bowling practice for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

}
