package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from container
		 SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on bean
		 System.out.println(swimCoach.getDialyWorkout());
		 //call method to get daily fortune 
		 System.out.println(swimCoach.getDialyFortune());
		 //get team email
		 System.out.println(swimCoach.getEmail());
		 //get team name
		 System.out.println(swimCoach.getTeam());
		
		//close the container  
		 context.close();

	}

} 
