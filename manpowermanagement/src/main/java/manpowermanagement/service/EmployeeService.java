package manpowermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import manpowermanagement.DAO.Employees;
import manpowermanagement.Exception.ResourceNotFoundException;
import manpowermanagement.repository.EmployeeRepository;

@Service
@Configuration
//@ComponentScan("com.manpower.co.manpowermanagement.repository")
public class EmployeeService {
	@Autowired
     EmployeeRepository employeeRepository;
		
	public List<Employees> getAllEmployees()
	{
		return employeeRepository.findAll();
	}
	public Employees getEmployeeById(String id) throws ResourceNotFoundException
	{
		//Optional<Client> optionalClient = clientRepository.findById(id);
		//Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found with id " + id));
		
		//Client client = clientRepository.findById(id).orElseThrow();
		
		Employees employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
	
		return employee;
	}
	public Employees createEmployee(Employees employee)
	{
		return employeeRepository.save(employee);
	}
	public Employees updateEmployee(String id,Employees employeeDetails) throws ResourceNotFoundException
	{
		Employees employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
		employee.setEmp_Name(employeeDetails.getEmp_Name());
		employee.setEmp_Type(employeeDetails.getEmp_Type());
		employee.setEmp_Mail(employeeDetails.getEmp_Mail());
		employee.setEmp_Phone(employeeDetails.getEmp_Phone());
		employee.setEmp_Designation(employeeDetails.getEmp_Designation());
		employee.setEmp_Skills(employeeDetails.getEmp_Skills());
		employee.setProj_ID(employeeDetails.getProj_ID());
		return employeeRepository.save(employee);
	}
    public void deleteEmployee(String id) throws ResourceNotFoundException
    {
    	Employees employee=employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not found by id"+id));
    	employeeRepository.delete(employee);
    }
}
