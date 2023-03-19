package fr.mspr.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.mspr.entities.Commande;
import fr.mspr.repositories.CommandeRepository;
import fr.mspr.repositories.LigneDeCommandeRepository;

@RestController
public class CommandeController {
	
	@Autowired
	CommandeRepository commandeRepo;
	@Autowired
	LigneDeCommandeRepository ligneDeCommandeRepo;
	
	@GetMapping("/commandes")
	public List<Commande> getAllCommandes() {
		List<Commande> listCommandes = new ArrayList<>();
		commandeRepo.findAll().forEach(listCommandes::add);
		return listCommandes;
	}
	
	@GetMapping("/commandes/{id}")
	public ResponseEntity<Commande> getCommandeById(@PathVariable(value="id") Integer commandeId) {
		Commande commande = commandeRepo.findById(commandeId).orElse(null);
		return ResponseEntity.ok().body(commande);
	}
	
	// §Créer une ligne de commande
	@PostMapping("/commandes/create")
	public ResponseEntity<Commande> createCommande(@RequestBody Commande commande) {
		commandeRepo.save(commande);
		//List<LigneDeCommande> ligneDeCommandes = (List<LigneDeCommande>) commande.getLigneDeCommande();
		/*
		for(LigneDeCommande ldc : ligneDeCommandes ) {
			ldc.setRefCommande(Commande.ge);
			// on fait une boucle et pour chaque commande on le sauvegarede dans ligne de commande (ligneDeCommandeRepo.save(ldc)
		}
		*/
		return null;
	}
	
	/*
	@PutMapping("/commandes/ligneCommande/{id}")
	public LigneDeCommande updateLigneDeCommande() {
		return ligneDeCommande;
	}
	
	@DeleteMapping("/commandes/ligneCommande{id}")
	public LigneDeCommande updateLigneDeCommande() {
		return ligneDeCommande;
	}
	*/

}
