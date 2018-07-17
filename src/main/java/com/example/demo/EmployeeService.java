package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService{
	private Map<Integer,Employee> employees = DatabaseClass.getAllEmployees();
	
	public EmployeeService() {
		employees.put(1,new Employee(1,"Nitish","nitish@gimil,com","Delhi"));
		employees.put(2,new Employee(2,"Karasa","kaeere@gimil,com","Bangalore"));
	}
	
	//Passing a collection to a arraylist constructor initialises the list with those elements
	public List<Employee> getAllEmployees(){
		return new ArrayList<Employee>(employees.values());	
	}
	
	//GetService for getting data using id
	public Employee getEmployee(int id) {
		Employee emp = employees.get(id);
		return emp;
	}
	
	//PostService
	public Employee addEmployee(Employee emp) {
		employees.put(emp.getId(), emp);
		return emp;
	}
	
	//Put Service
	public Employee updateEmployee(Employee emp) {
		if(employees.containsKey(emp.getId()))
			employees.remove(emp.getId());
	
		employees.put(emp.getId(),emp);
		return emp;
	}
	
	//Delete Service
	public Employee removeEmployee(int id) {
		return employees.remove(id);
	}
}
