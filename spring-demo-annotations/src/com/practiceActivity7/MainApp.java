package com.practiceActivity7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.Coach;

public class MainApp 
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoccerConfig.class);

		Coach theCoach= context.getBean("soccerCoach",Coach.class);


		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());



	}
}
