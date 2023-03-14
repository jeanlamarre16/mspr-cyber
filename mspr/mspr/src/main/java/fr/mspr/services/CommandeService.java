package fr.mspr.services;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mspr.entities.Produit;
import fr.mspr.repositories.CommandeRepository;

@Service
public class CommandeService {
	
	@Autowired
	private CommandeRepository commandeRpository;
	

	private static List<Produit> produits = new ArrayList<>(Arrays.asList(
			new Produit(
					1, "GG44533", "Chaise de Bureau", "catégorie cuisine", 
					"Gris", "Bois", "https://fr.freepik.com/vecteurs-libre/blanc-chaise-bureau_838182.htm#query=chaise%20de%20bureau&position=28&from_view=search&track=ais", (float) 12.58, 15, "China"
					),
			new Produit(
					2, "FR45563", "Table rond", "catégorie cuisine", 
					"Beige", "Stratifié", "https://fr.freepik.com/photos-premium/oranges-fraiches-table_12843442.htm#query=table%20cuisine&position=41&from_view=search&track=ais", (float) 500, 15, "China"
					),
			new Produit(
					3, "GC44025", "Frigo", "catégorie cuisine", 
					"Gris métalisé", "Métal", "https://img.freepik.com/vecteurs-premium/frigo-ferme-plein-produits_91248-76.jpg?w=740", (float) 850.99, 5, "China"
					)

			));
	
	
	public static List<Produit> getProduits() {
		return produits;
	}
	
	public static Produit getProduitById(long id) {
		return produits.stream().filter(produit -> produit.getId() == id).findFirst().orElse(null);
	}
	
	public void deleteProduit(long id) {
		commandeRpository.deleteById(id);
	}

	public void updateProduit(Produit produit, long id) {
		commandeRpository.save(produit);
	}

	public void addProduit(Produit produit) {
		commandeRpository.save(produit);	
	}
	
}
