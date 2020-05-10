package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach 
{
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	// defining default constructor

	public TennisCoach()
	{
		System.out.println("inside a default constructor");
	}

	/*
	 * // define setter injection injection
	 * 
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("inside setter injection "); this.fortuneService =
	 * fortuneService; }
	 */
	
	/*// this is constructor injection
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * System.out.println("Parameterized constructor"); this.fortuneService =
	 * fortuneService; }
	 */
	 

	public String getDailyWorkout()
	{

		return "practice your backhand volly";
	}

	@Override
	public String getDailyFortunr() {

		return fortuneService.getFortune();
	}

}