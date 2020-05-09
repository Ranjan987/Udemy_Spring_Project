package com.luv2code.springdemo;

// This is the implementation class 

public class HappyFortuneService implements FortuneService
{

	@Override
	public String getFortune()
	{
		
		return "today is your lucky day!";
	}

	
}
