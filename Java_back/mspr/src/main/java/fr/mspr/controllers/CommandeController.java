package fr.mspr.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.mspr.entities.Commande;
import fr.mspr.entities.Produit;
import fr.mspr.repositories.ClientRepository;
import fr.mspr.repositories.CommandeRepository;
import fr.mspr.repositories.ProduitRepository;

@RestController
public class CommandeController {
	
	@Autowired
	CommandeRepository commandeRepository;
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	ProduitRepository produitRepository;
	
	@GetMapping("/commandes")
	public Iterable<Commande> getAllCommandes() {
		List<Commande> listCommandes = new ArrayList<>();
		commandeRepository.findAll().forEach(listCommandes::add);
		return listCommandes;
	}
	
	@GetMapping("/commandes/{idCommande}")
	public Optional<Commande> getCommandeById(@PathVariable int idCommande) {
		Optional<Commande> commande = commandeRepository.findById(idCommande);
		return commande;
	}
	
	// Afficher tous les produits d'une commande donnée
	@GetMapping("/commandes/{idCommande}/produits")
	public Iterable<Produit> getAllProduits(@PathVariable int idCommande) {
		List<Produit> produits = commandeRepository.findById(idCommande).get().getProduits();
		return produits;
	}
	
	// Créer une ligne de commande
	@PostMapping("/commandes/create")
	public ResponseEntity<Commande> createCommande(@RequestBody Commande commande) {
		// 1- choisir le.s produit.s
		Produit prod = new Produit();
		produitRepository.findById(prod.getIdProduit());
				
		// 2- affecter les produits à la ligne de commande
		Commande commande1 = new Commande();
		
		commande1.addProduit(prod);
		// 3- insérer la ligne de commande dans commande
		commandeRepository.save(commande1);
		return null;
	}

	@PutMapping("/commandes/{idCommande}")
	public void updateCommande(@RequestBody Commande commande, @PathVariable int idCommande) {
		// traitement
	}
	
	@DeleteMapping("/commandes/{idCommande}")
	public void deleteCommande(@PathVariable int idCommande) {
		// traitement
	}
}
