package com.social.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping
	public String homecontrollerhandler() {
		return "this is homecontroller";
	}
	
	
	@GetMapping("/home")
	public String homecontrollerhandler2() {
		return "this is homecontroller2";
	}
	
//	@DeleteMapping
//	@PostMapping
//	@PutMapping
}
