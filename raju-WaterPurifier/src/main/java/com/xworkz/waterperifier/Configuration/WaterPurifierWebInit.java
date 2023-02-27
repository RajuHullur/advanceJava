package com.xworkz.waterperifier.Configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WaterPurifierWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running  getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running  getServletConfigClasses");
		Class [] classes={WaterpurifierConfiguration.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		String[] String= {"/"};
		return String;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling method");
		configurer.enable();
	}

}
