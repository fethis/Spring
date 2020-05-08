package com.fethi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fethi.domain.Employee;

@Controller
public class Welcome {
	
	@RequestMapping("/")
	public String test() {
		
		return "welcome";
	}
	



}
