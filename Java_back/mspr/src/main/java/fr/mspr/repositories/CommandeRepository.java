package fr.mspr.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.mspr.entities.Commande;

public interface CommandeRepository extends CrudRepository<Commande, Integer> {

}
