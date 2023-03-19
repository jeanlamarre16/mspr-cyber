package fr.mspr.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.mspr.entities.LigneDeCommande;

public interface LigneDeCommandeRepository extends CrudRepository<LigneDeCommande, Integer> {

}
