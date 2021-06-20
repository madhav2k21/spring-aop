package com.techleads.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techleads.app.repository.CalculateRepository;

@Service
public class CalculateService {
	
	private CalculateRepository calculateRepository;

	@Autowired
	public CalculateService(CalculateRepository calculateRepository) {
		this.calculateRepository = calculateRepository;
	}

	public String add(int a, int b) {
		int sum = calculateRepository.add(a, b);
		return "Sum = "+sum;
		
	}
	
	
	

}
