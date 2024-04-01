package manpowermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import manpowermanagement.DAO.Projects;
import manpowermanagement.Exception.ResourceNotFoundException;
import manpowermanagement.repository.ProjectRepository;


@Service
@Configuration
//@ComponentScan("com.manpower.co.manpowermanagement.repository")
public class ProjectService {
	@Autowired
     ProjectRepository projectRepository;
		
	public List<Projects> getAllProject()
	{
		return projectRepository.findAll();
	}
	public Projects getProjectById(String id) throws ResourceNotFoundException
	{
		//Optional<Client> optionalClient = clientRepository.findById(id);
		//Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found with id " + id));
		
		//Client client = clientRepository.findById(id).orElseThrow();
		
		Projects project = projectRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Project not found with id " + id));
	
		return project;
	}
	public Projects createProject(Projects project)
	{
		return projectRepository.save(project);
	}
	public Projects updateProject(String id,Projects projectDetails) throws ResourceNotFoundException
	{
		Projects project = projectRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Project not found with id " + id));
		project.setName(projectDetails.getName());
		project.setProj_Duration(projectDetails.getProj_Duration());
		project.setProj_Status(projectDetails.getProj_Status());
		project.setCli_Id(projectDetails.getCli_Id());
		return projectRepository.save(project);
	}
    public void deleteProject(String id) throws ResourceNotFoundException
    {
    	Projects project=projectRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Project not found by id"+id));
    	projectRepository.delete(project);
    }
}
