package com.practiceActivity7;

import com.luv2code.springdemo.Coach;

public class SoccerCoach implements Coach
{
	private SoccerFortuneService soccerFortuneService;
	

	public SoccerCoach(SoccerFortuneService soccerFortuneService)
	{
		
		this.soccerFortuneService = soccerFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "practice football by passing with other team mates";
	}

	@Override
	public String getDailyFortune() {
		
		return soccerFortuneService.getFortune();
	}

}
