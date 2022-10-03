package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping(value = "/")
	public String welcome() {
		return "Welcome ,to test the web app enter /tools ";
	}
}
