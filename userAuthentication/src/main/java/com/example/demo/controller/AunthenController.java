package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AunthenController 
{
	@GetMapping("/hello")
	public String login()
	{
		return "you are logged in";
	}
}