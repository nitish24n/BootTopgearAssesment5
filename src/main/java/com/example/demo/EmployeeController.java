package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/All")
	public List<Employee> getAll() {
		return empService.getAllEmployees();
	}
	
	@GetMapping("Employee/{id}")
	public Employee getEmpById(@PathVariable("id") int id) {
		Employee emp = empService.getEmployee(id);
		return emp;
	}
	
	@PostMapping("/Save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		empService.addEmployee(emp);
		return emp;
	}
	
	@PutMapping("/Update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		empService.updateEmployee(emp);
		return emp;
	}
	
	@DeleteMapping("/Delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		empService.removeEmployee(id);
		return "Deleted";
	}
	
}
