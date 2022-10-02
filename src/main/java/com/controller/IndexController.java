package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class IndexController {
	
	@RequestMapping(value = "/")
	public ModelAndView showIndexPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");

		return mav;
	}
}












