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
import manpowermanagement.DAO.Projects;
import manpowermanagement.Exception.ResourceNotFoundException;
import manpowermanagement.service.ProjectService;


@RestController
@RequestMapping("/api/projects")

public class ProjectController {
	@Autowired
	ProjectService projectservice;
	@GetMapping("/getall")
	public List<Projects> getAllProject()
	{
		return projectservice.getAllProject();
	}
	@GetMapping("/{id}")
	public Projects getClientById(@PathVariable String id)
	{
		try {
			return projectservice.getProjectById(id);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	@PostMapping()
	public Projects createProject(@Valid @RequestBody Projects project)
	{
		return projectservice.createProject(project);
	}
	@PutMapping("/{id}")
	public Projects updateProject(@PathVariable String id,@Valid @RequestBody Projects projectDetails)
	{
		try {
			return projectservice.updateProject(id,projectDetails);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projectDetails;
	
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteProject(@PathVariable String id)
	{
		try {
			projectservice.deleteProject(id);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok().build();
	}
	
	

}
