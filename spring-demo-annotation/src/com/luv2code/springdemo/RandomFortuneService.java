package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    
	//create String array having fortune
	private  String[] data = {"Action Speaks Louder then word","Success is action everting else is commentry","Start Littel Early ,Work littel Harder,Stay littel late"};
	
	//Create Random number generator
	private Random myRandom= new Random();
	
	@Override
	public String getDailyFortune() {
		//pick random string from array
		
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
