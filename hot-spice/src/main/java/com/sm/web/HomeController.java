package com.sm.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class HomeController {
		
	final String homepage= "home";
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String showPage(Model model){

		return homepage;
	}
	
}
