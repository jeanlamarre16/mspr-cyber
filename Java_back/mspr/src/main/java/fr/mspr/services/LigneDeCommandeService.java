package fr.mspr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mspr.entities.Commande;
import fr.mspr.repositories.CommandeRepository;

@Service
public class LigneDeCommandeService {
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	/*
	public List<Produit> getAllProduits() {
		List<Produit> produits = new ArrayList<>();
		commandeRepository.findAll().forEach(produit ->{
			produits.add(produit);
		});
		return produits;
	}
	*/
	
	public Commande getProduitById(int id) {
		try {
			return commandeRepository.findById(id).orElse(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void deleteProduit(int id) {
		commandeRepository.deleteById(id);;
	}

	/*
	public void updateProduit(Produit produitAModifier, int id) {
		commandeRepository.save(produitAModifier);
	}

	public void addProduit(Produit produit) {
		commandeRepository.save(produit);
	}
	*/
}
