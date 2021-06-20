package com.techleads.app.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CalculateRepository {

	public int add(int a, int b) {

		return a+b;
	}
}
