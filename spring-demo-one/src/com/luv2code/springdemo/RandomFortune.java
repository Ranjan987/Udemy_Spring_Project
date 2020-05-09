package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {


	public String arr[] = {"Hi done very well!","Hello best of luch for your future!","Thanks for joining !"};

	// create a random number generator

	Random r =new Random();

	@Override
	public String getFortune() 
	{
		// pick up a random from string 
		int index = r.nextInt(arr.length);

		String theFortune = arr[index];

		return theFortune;
	}

}
