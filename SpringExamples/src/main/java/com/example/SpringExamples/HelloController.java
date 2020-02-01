package com.example.SpringExamples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("showHello")	
	public String showHello() {
		return "hivarad";
	}
}
