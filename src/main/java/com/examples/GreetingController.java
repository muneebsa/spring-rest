package com.examples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
		
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(defaultValue="World") String name) {
		Greeting response = new Greeting(name);	
		return response;
	}
	
	@RequestMapping("/greeting2")
	public Greeting greeting2(@RequestParam(defaultValue="World") String name) {
		Greeting response = new Greeting(name);	
		return response;
	}
}
