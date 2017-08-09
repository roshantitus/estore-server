package com.rsinc.estore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@EnableAutoConfiguration
public class EstoreServerApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EstoreServerApplication.class, args);
	}
	
	
	@Override 
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) { 
		return application.sources(EstoreServerApplication.class); 
	}		
}
