package fr.mspr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mspr.entities.Produit;
import fr.mspr.repositories.ProduitRepository;

@Service
public class ProduitService {
	@Autowired
	private ProduitRepository produitRepository;
	
	public Iterable<Produit> getAllProduits() {
		return produitRepository.findAll();
	}
	
	public Produit getProduitById(int id) {
		return produitRepository.findById(id).orElse(null);
	}
	
	public void deleteProduit(int id) {
		produitRepository.deleteById(id);
	}

	public void updateProduit(Produit produitAModifier, int id) {
		produitRepository.save(produitAModifier);
	}

	public void addProduit(Produit produit) {
		produitRepository.save(produit);
	}
}
