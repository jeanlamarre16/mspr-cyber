package fr.mspr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.mspr.entities.Produit;
import fr.mspr.services.ProduitService;

@RestController
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@GetMapping("/produits")
	public Iterable<Produit> findAllProducts() {
		return produitService.getAllProduits();
	}
	
	@GetMapping("/produits/{id}")
	public Produit findProductById(@PathVariable int id) {
		return produitService.getProduitById(id);
	}
	
	@PostMapping("/produits/create")
	public void addProduct(@RequestBody Produit produit) {
		produitService.addProduit(produit);
	}
	
	@DeleteMapping("/produits/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		produitService.deleteProduit(id);
	}
	
	@PutMapping("/produits/update/{id}")
	public void updateProduct(@RequestBody Produit produit, @PathVariable int id) {
		produitService.updateProduit(produit, id);	
	}
}
