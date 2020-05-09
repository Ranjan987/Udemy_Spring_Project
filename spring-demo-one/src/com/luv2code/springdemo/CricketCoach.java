package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		this.team = team;
	}

	// create a no-arg constructor
	
	public CricketCoach() {
		System.out.println("we ae inside no-arg costructor");
	}
	

// our setter method
	public void setFortuneService(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
		System.out.println("we are inside setter method");
	}

	@Override
	public String getDailyWorkout()
	{
		
		return "spend 20 min on bowling practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune() ;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}

}
