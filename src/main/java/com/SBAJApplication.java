package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SBAJApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBAJApplication.class, args);
		System.out.println("Server running");
	}

}
