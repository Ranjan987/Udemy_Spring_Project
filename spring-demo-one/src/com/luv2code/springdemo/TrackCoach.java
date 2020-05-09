package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

	// define a private field for the dependency

	private FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService) 
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout()
	{		
		return "run for 10 mins";
	}


	@Override
	public String getDailyFortune()
	{

		return fortuneService.getFortune();
	}

	// add init method

	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}

	// add destroy method
	

	@Override
	public void destroy() throws Exception {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");		
	}
}
