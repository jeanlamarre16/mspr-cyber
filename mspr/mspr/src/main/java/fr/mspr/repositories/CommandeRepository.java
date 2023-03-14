package fr.mspr.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.mspr.entities.Produit;

public interface CommandeRepository extends CrudRepository<Produit, Integer> {

	void deleteById(long id);

	Optional<Produit> findById(Long id);

}
