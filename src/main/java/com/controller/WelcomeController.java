package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WelcomeController {

	
	@GetMapping(value = "/")
	public String welcome() {
		return "index";
	}
}
