package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@CrossOrigin
	@GetMapping(path = "/checkHealth")
	public String checkHealth() {
		
		
		return "Message from server!!";
	}

}
