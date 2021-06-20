package com.techleads.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techleads.app.service.CalculateService;

@RestController
public class CalculateController {
	
	private CalculateService calculateService;

	public CalculateController(CalculateService calculateService) {
		this.calculateService=calculateService;
	}
	
	@GetMapping("/calc")
	public String add(@RequestParam(defaultValue = "12", name = "a") int a,
			@RequestParam(defaultValue = "13", name = "b") int b) {
		String result = calculateService.add(a, b);
		return result;
		
	}
	
	

}
