package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define a bean for sad FortuneService
	 @Bean
	 public FortuneService sadFortuneService() {
		 return new SadFortuneService();
	 }
	
	//define a bean for SwimCoach and inject dependency 
	 @Bean
	 public Coach swimCoach() {
		 SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
				 return mySwimCoach;
		 
	 }

}
