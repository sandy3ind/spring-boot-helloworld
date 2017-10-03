package com.javagain.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(ModelMap model) {
		model.put("title", "Welcome Spring Boot");
		return "hello";
	}
	
}
