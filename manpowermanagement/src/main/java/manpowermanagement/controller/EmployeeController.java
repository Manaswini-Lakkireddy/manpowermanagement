package manpowermanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import manpowermanagement.DAO.Employees;
import manpowermanagement.Exception.ResourceNotFoundException;
import manpowermanagement.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")

public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	@GetMapping("/getall")
	public List<Employees> getAllEmployees()
	{
		return employeeservice.getAllEmployees();
	}
	@GetMapping("/{id}")
	public Employees getEmployeeById(@PathVariable String id)
	{
		try {
			return employeeservice.getEmployeeById(id);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	@PostMapping()
	public Employees createEmployee(@Valid @RequestBody Employees employee)
	{
		return employeeservice.createEmployee(employee);
	}
	@PutMapping("/{id}")
	public Employees updateEmployee(@PathVariable String id,@Valid @RequestBody Employees employeeDetails)
	{
		try {
			return employeeservice.updateEmployee(id,employeeDetails);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeDetails;
	
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable String id)
	{
		try {
			employeeservice.deleteEmployee(id);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok().build();
	}
	
	

}
