package com.psl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	
	@GetMapping("/hello")
	public String sayHelloWorld(){
		return "Hello World!";
	}
}
