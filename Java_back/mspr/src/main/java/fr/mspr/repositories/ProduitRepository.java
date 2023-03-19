package fr.mspr.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.mspr.entities.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Integer> {

}

