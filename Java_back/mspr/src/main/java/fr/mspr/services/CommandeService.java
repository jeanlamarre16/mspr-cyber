package fr.mspr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.mspr.entities.Commande;
import fr.mspr.repositories.CommandeRepository;

@Service
public class CommandeService {
	@Autowired
	private CommandeRepository commandeRepository;
	
	public Iterable<Commande> getAllCommandes() {
		return commandeRepository.findAll();
	}
	
	public Commande getCommandeById(int idCommande) {
		return commandeRepository.findById(idCommande).orElse(null);
	}
	
	public void deleteCommande(int id) {
		commandeRepository.deleteById(id);
	}

	public void updateCommande(Commande commande, int id) {
		commandeRepository.save(commande);
	}

	public void addCommande(Commande commande) {
		commandeRepository.save(commande);
	}

}
