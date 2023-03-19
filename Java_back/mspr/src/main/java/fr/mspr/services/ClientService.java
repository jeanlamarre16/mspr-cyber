package fr.mspr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mspr.entities.Client;
import fr.mspr.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public Iterable<Client> getAllClients() {
		return clientRepository.findAll();
	}
	
	public Client getClientById(int id) {
		return clientRepository.findById(id).orElse(null);
	}
	
	public void deleteClient(int id) {
		clientRepository.deleteById(id);
	}

	public void updateClient(Client client, int id) {
		clientRepository.save(client);
	}

	public void addClient(Client client) {
		clientRepository.save(client);
	}
}
