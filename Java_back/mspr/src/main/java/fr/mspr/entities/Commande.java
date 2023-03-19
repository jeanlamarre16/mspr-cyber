package fr.mspr.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande {
	@Id
	@Column(name="id_commande")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCommande;
	
	@Column(name="ref_commande", nullable=false, length=9)
	private String refCommande;
	
	@Column(name="date_commande", nullable=false)
	private LocalDateTime dateCommande;
	
	private boolean statut; // en cours - livré

	@ManyToOne
	@JoinColumn(name="id_client", nullable=false)
	private Client client;
	
	@OneToMany(
		mappedBy="idCommande",
		orphanRemoval = true, 
		fetch = FetchType.EAGER
	)
	private List<LigneDeCommande> ligneDeCommandes = new ArrayList<>();
	
	// ========== Constructeurs ============
	
	public Commande(int idCommande, String refCommande, LocalDateTime dateCommande, Client client, List<LigneDeCommande> ligneDeCommandes) {
		super();
		this.idCommande = idCommande;
		this.refCommande = refCommande;
		this.client = client;
		this.ligneDeCommandes = ligneDeCommandes;
		this.dateCommande = dateCommande;
	}

	public Commande() {super();}
	
	// ========== Getters Et Setters ===========
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDateTime getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(LocalDateTime dateCommande) {
		this.dateCommande = dateCommande;
	}

	public boolean isStatut() {
		return statut;
	}

	public List<LigneDeCommande> getLigneDeCommandes() {
		return ligneDeCommandes;
	}
	
	public void setLigneDeCommandes(List<LigneDeCommande> ligneDeCommandes) {
		this.ligneDeCommandes = ligneDeCommandes;
	}
	
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	
	public void setRefCommande(String refCommande) {
		this.refCommande = refCommande;
	}
	
	public long getIdCommande() {
		return idCommande;
	}
	
	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}
	
	public String getRefCommande() {
		return refCommande;
	}
	
	public void setRefProduit(String refCommande) {
		this.refCommande = refCommande;
	}
	
	//============= Helpers Methods ===============
	
	public void addLigneDeCommande(LigneDeCommande ldc) {
		ligneDeCommandes.add(ldc);
		//ldc.getCommande().ligneDeCommandes.add(this);	
	}
	
	public void removeLigneDeCommande(LigneDeCommande ldc) {
		ligneDeCommandes.remove(ldc);
	}
}



