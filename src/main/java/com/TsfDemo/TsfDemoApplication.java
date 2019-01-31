package com.TsfDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.TsfDemo"})
public class TsfDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsfDemoApplication.class, args);
	}

}

