package com.xworkz.Server.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Server")
public class FoodItemConfiguration {

	public FoodItemConfiguration() {
		System.out.println("Created...... " + this.getClass().getSimpleName());
	}

}



