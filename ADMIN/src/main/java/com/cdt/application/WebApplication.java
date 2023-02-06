package com.cdt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cdt")
public class WebApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(WebApplication.class, args);
	}

}
