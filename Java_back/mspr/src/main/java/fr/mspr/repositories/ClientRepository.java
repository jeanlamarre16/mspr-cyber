package fr.mspr.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.mspr.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>{
	
}
