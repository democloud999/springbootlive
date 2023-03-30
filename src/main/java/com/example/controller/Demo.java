package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping("/")
	public String test() {
		return "<center><h1>Running Spring Boot from Cloud!!!!!</h1></center>";
	}

}
