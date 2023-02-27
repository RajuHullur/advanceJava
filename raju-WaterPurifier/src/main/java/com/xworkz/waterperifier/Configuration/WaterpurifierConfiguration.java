package com.xworkz.waterperifier.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.waterperifier")
public class WaterpurifierConfiguration {
	
	public WaterpurifierConfiguration() {
		System.out.println("Created :"+this.getClass().getSimpleName());
	}
	
	@Bean
   public ViewResolver  viewResolver() {
		System.out.println("Running Viewresolver method");
	return new InternalResourceViewResolver("/",".jsp");	
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManager() {
		System.out.println("running LocalContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}
	

}
