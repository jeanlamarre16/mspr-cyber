package fr.mspr.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCommande;
	
	@Column(name="ref_commande", nullable=false, length=9)
	private String refCommande;
	
	@Column(name="date_commande", nullable=false)
	private LocalDate dateCommande;
	
	@Column(name="statut", nullable=false)
	private boolean statut; // en cours = true / livré = false

	@ManyToOne(optional = false)
	private Client client;
	
	@Column(name="produit")
	@ManyToMany(
		fetch = FetchType.EAGER,
		cascade = CascadeType.ALL
	)
	private List<Produit> produits;
	
	// ========== Constructeurs ============
	
	public Commande(int idCommande, String refCommande, LocalDate dateCommande, Client client, List<Produit> produits) {
		super();
		this.idCommande = idCommande;
		this.refCommande = refCommande;
		this.client = client;
		this.produits = produits;
		this.dateCommande = LocalDate.now();
	}

	public Commande() {super();}
	
	// ========== Getters Et Setters ===========
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDate getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(LocalDate dateCommande) {
		this.dateCommande = dateCommande;
	}

	public boolean isStatut() {
		return statut;
	}

	public List<Produit> getProduits() {
		return produits;
	}
	
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
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
	
	public void addProduit(Produit prod) {
		produits.add(prod);	
	}
	
	public void removeProduit(Produit prod) {
		produits.remove(prod);
	}
}



