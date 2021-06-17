package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring container
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from container
		 Coach theCoach = context.getBean("tennisCoach",Coach.class);
		 
		 Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		 
		 boolean result= (theCoach==alphaCoach);
		 System.out.println("\n Poninting to the same objects: "+result);
		 
		 System.out.println("\nMemory location of the theCoach "+theCoach);
		 System.out.println("\nMemory location of the alphaCoach "+alphaCoach);
		
		
		//close the container
		 context.close();

	}

}
