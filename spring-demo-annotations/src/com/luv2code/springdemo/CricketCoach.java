package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{

	@Override
	public String getDailyWorkout() {
		
		return "Do the bowling practice for 30 mins";
	}

	@Override
	public String getDailyFortunr() {
		
		return null;
	}

}
