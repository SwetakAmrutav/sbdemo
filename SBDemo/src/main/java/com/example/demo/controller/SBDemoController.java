package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.SBDemoService;

@RestController
@RequestMapping({ "sbdemo" })
public class SBDemoController {

	@Autowired
	private SBDemoService service;
	
	@GetMapping("/demo")
	public String demo() {
		return "Greetings From SBDemo";
	}
	
	@PostMapping("/saveUser")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		service.saveUser(user);
		return new ResponseEntity<>(HttpStatus.OK);
				
	}

}
