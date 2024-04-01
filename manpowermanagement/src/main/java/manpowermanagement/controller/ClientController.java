package manpowermanagement.controller;
import org.springframework.web.bind.annotation.RestController;

//import com.manpower.co.manpowermanagement.ClientService;
import jakarta.validation.Valid;
import manpowermanagement.DAO.Client;
import manpowermanagement.Exception.ResourceNotFoundException;
import manpowermanagement.service.ClientService;

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
@RestController
@RequestMapping("/api/client")

public class ClientController {
	@Autowired
	ClientService clientservice;
	@GetMapping("/getall")
	public List<Client> getAllClient()
	{
		return clientservice.getAllClient();
	}
	@GetMapping("/{id}")
	public Client getClientById(@PathVariable String id)
	{
		try {
			return clientservice.getClientById(id);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	@PostMapping()
	public Client createClient(@Valid @RequestBody Client client)
	{
		return clientservice.createClient(client);
	}
	@PutMapping("/{id}")
	public Client updateClient(@PathVariable String id,@Valid @RequestBody Client clientDetails)
	{
		try {
			return clientservice.updateClient(id,clientDetails);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientDetails;
	
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteClient(@PathVariable String id)
	{
		try {
			clientservice.deleteClient(id);
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.ok().build();
	}
	
	

}
