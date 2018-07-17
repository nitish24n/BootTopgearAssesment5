package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
	
	private static Map<Integer,Employee> employees = new HashMap<>();
	
	public static Map<Integer,Employee> getAllEmployees(){
		return employees;
	}

}
