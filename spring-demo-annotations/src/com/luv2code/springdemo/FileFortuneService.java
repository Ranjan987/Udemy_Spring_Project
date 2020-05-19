package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


@Component
public class FileFortuneService implements FortuneService
{

	private String fileName = "D:\\fortune-data.txt";
	private List<String> theFortunes;

	// create a random number generator

	private Random myRandom = new Random();

	//create constructor

	/*
	 * public FileFortuneService() {
	 * System.out.println("inside default constructor"); }
	 */

	@PostConstruct
	public void FileService() 
	{
		System.out.println("inside postcontruct");
		File theFile = new File(fileName)  ;

		System.out.println("Reading fortunes from file: "+theFile);
		System.out.println("File exists:"+ theFile.exists());

		//initialize array list
		theFortunes = new ArrayList<String>();

		// read fortune from the file
		try(BufferedReader br =new BufferedReader(new FileReader(theFile)))
		{
			String tempLine;

			while ((tempLine = br.readLine())!=null)
			{
				theFortunes.add(tempLine);
			}
		} /*
		 * catch (FileNotFoundException e) {
		 * 
		 * e.printStackTrace(); }
		 */ catch (IOException e)
		{

			 e.printStackTrace();
		}

	}
	@Override

	public String getFortune()
	{

		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());

		System.out.println(theFortunes.size());
		String tempFortune = theFortunes.get(index);
		return tempFortune;
	}

}
