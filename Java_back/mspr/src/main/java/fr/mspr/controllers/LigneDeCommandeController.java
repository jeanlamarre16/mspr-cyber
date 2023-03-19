package fr.mspr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.mspr.services.LigneDeCommandeService;

@RestController
@RequestMapping("/lignedecommade")
public class LigneDeCommandeController {
	@Autowired
	private LigneDeCommandeService ligneCommandeService;
	
	/*
	@GetMapping("/produits")
	public List<Produit> findAllProducts() {
		return ligneCommandeService.getProduits();
	}
	
	@GetMapping("/produits/{id}")
	public Produit findProductById(@PathVariable int id) {
		return ligneCommandeService.getProduitById(id);
	}
	
	@PostMapping("/produit/create")
	public void addProduct(@RequestBody Produit produit) {
		ligneCommandeService.addProduit(produit);
	}
	
	@DeleteMapping("/produits/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		ligneCommandeService.deleteProduit(id);
	}
	
	@PutMapping("/produits/update/{id}")
	public void updateProduct(@RequestBody Produit produit, @PathVariable int id) {
		ligneCommandeService.updateProduit(produit, id);	
	}
	*/
}
