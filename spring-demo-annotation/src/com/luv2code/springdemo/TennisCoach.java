package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService=fortuneService; }
	 */
	
	//define default constructor
	public TennisCoach() {
		System.out.println("TennisCoach :Inside default constructor ");
	}
	@Override
	public String getDialyWorkout() {
		return "Practice your back hand volly";
	}

	@Override
	public String getDialyFortune() {
		
		return fortuneService.getDailyFortune();
	}
	
	//setter method for autowiring FortuneService dependency
	/*
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * System.out.println("TennisCoach : inside setFortuneService() method ");
	 * this.fortuneService=fortuneService; }
	 */
	
	//Autowiring using any method
	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * System.out.println("TennisCoach : inside doSomeCrazyStuff() method ");
	 * this.fortuneService=fortuneService; }
	 */
	
	
	//define init method
	//@PostConstruct
	public void myInit() {
		System.out.println("TennisCoach : myInit() method");
	}
	
	
	//define destroy method
	//@PreDestroy
	public void myDestroy() {
		System.out.println("TennisCoach : myDestroy() method");
	}
}
