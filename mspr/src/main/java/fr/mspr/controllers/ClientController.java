package fr.mspr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mspr.repositories.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientRepository clientRepository;
	
	//@GetMapping("/")
	/*public Client getClients() {
		return clients;
	}
	
	@GetMapping("/{id}")
	public Client getClient() {
		return ClientRepository;
	}
	
	@PostMapping("/add")
	public Client addClient() {
		
	}
	
	@PutMapping("/update/{id}")
	public Client updateClient(@VariablePath Student student) {
		
	}
	
	@DeleteMapping("/delete/{id}")
	public Client deleteClient(Client client, int id) {
		
	}
	*/

}
