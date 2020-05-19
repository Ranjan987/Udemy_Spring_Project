package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//read spring config file

		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SportConfig.class);

		//get bean from spring container

		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		//call a method on the bean 

		System.out.println(theCoach.getDailyWorkout());
		
		// call the method to get daily fortune
		
		System.out.println(theCoach.getDailyFortune());
		
		//call our new swim coach methods ... has the props value inject
		
		System.out.println("Email: "+theCoach.getEmail());
		System.out.println("Team: "+theCoach.getTeam());
		// close the context
		context.close();
	}
}
