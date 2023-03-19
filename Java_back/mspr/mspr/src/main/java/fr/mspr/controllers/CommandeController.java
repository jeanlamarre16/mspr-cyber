package fr.mspr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mspr.entities.Produit;
import fr.mspr.services.CommandeService;

@RestController
@RequestMapping("/commande")
public class CommandeController {
	@Autowired
	private CommandeService commandeService;
	
	@RequestMapping("/produits")
	public List<Produit> findAllCommandes() {
		return commandeService.getProduits();
	}
	
	@RequestMapping("/produits/{id}")
	public Produit findCommandeById(@PathVariable long id) {
		return commandeService.getProduitById(id);
	}
	
	/*@PostMapping("/produit/add")
	public String addCommande(@RequestBody Produit produit) {
		//return "<h1>Ajouter une commande</h1>";
		return commandeRepository.save(produit);
	}
	*/
	
	@DeleteMapping("/produits/delete/{id}")
	public void deleteCommande(@PathVariable long id) {
		commandeService.deleteProduit(id);
	}
	
	@PutMapping("/produits/update/{id}")
	public String updateCommande() {
		return "<h1>Modifier une commande</h1>";
	}
	
}
