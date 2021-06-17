package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDialyWorkout() {
		
		return "Swim 1000 meter for warm up";
	}

	@Override
	public String getDialyFortune() {
		
		return fortuneService.getDailyFortune();
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

	
}
