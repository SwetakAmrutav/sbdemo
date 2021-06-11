package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbdemo")
public class SBDemoController {

	@GetMapping("/demo")
	public String demo() {
		return "Greetings From SBDemo";
		
	}
	
	
}
