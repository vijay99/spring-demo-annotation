package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from container
		 Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//call a method on bean
		 System.out.println(theCoach.getDialyWorkout());
		 //call method to get daily fortune 
		 System.out.println(theCoach.getDialyFortune());
		
		//close the container  
		 context.close();

	}

}
