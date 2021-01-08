package com.springbootsecurity1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping(value = "url")
	public String sayHello()
	{
		return "welcome to spring security";
	}
}
