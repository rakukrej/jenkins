package com.pega.practice.HelloWorld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/greater/{num1}/{num2}")
	public boolean hello(@PathVariable int num1,@PathVariable int num2) {
		
	        return num1 > num2;
	    
	}

}
