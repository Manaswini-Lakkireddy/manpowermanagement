package com.manpower.co.manpowermanagement.service;

import java.util.List;

//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.manpower.co.manpowermanagement.exception.ResourceNotFoundException;
import com.manpower.co.manpowermanagement.repository.ClientRepository;

import com.manpower.co.manpowermanagement.DAO.Client;

@Service
@Configuration
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
		
	public List<Client> getAllClient()
	{
		return clientRepository.findAll();
	}
	public Client getClientById(String id) throws ResourceNotFoundException
	{
		//Optional<Client> optionalClient = clientRepository.findById(id);
		//Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found with id " + id));
		
		//Client client = clientRepository.findById(id).orElseThrow();
		
		Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found with id " + id));
	
		return client;
	}
	public Client createClient(Client client)
	{
		return clientRepository.save(client);
	}
	public Client updateClient(String id,Client clientDetails) throws ResourceNotFoundException
	{
		Client client = clientRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Client not found with id " + id));
		client.setName(clientDetails.getName());
		return clientRepository.save(client);
	}
    public void deleteClient(String id) throws ResourceNotFoundException
    {
    	Client client=clientRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Client not found by id"+id));
    	clientRepository.delete(client);
    }
}
