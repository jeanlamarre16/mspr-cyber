package fr.mspr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.mspr.entities.Client;
import fr.mspr.services.ClientService;

@RestController
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/clients")
	public Iterable<Client> findAllClients() {
		return clientService.getAllClients();
	}
	
	@GetMapping("/clients/{id}")
	public Client findClientById(@PathVariable int id) {
		return clientService.getClientById(id);
	}
	
	@PostMapping("/clients/create")
	public void addClient(@RequestBody Client client) {
		clientService.addClient(client);
	}
	
	@DeleteMapping("/clients/delete/{id}")
	public void deleteClient(@PathVariable int id) {
		clientService.deleteClient(id);
	}

	@PutMapping("/clients/update/{id}")
	public void updateClient(@RequestBody Client client, @PathVariable int id) {
		clientService.updateClient(client, id);	
	}
}
