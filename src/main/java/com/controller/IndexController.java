package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	public ModelAndView showIndexPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");

		return mav;
	}
}












