package com.practiceActivity7;

import com.luv2code.springdemo.FortuneService;

public class SoccerFortuneService implements FortuneService 
{

	@Override
	public String getFortune() {
		
		return "Well done";
	}

}
