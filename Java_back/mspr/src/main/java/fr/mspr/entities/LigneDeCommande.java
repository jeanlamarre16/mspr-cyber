package fr.mspr.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ligne_commande")
public class LigneDeCommande {
	@Id
	@Column(name="id_ligne_commande")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLigneCommande;
	
	@Column(name="ref_produit", nullable=false, length=9)
	private String refProduit;
	
	@Column(name="quantite", nullable=false)
	private int quantite;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idCommande")
	private Commande commande;
	
	@ManyToMany(
		fetch = FetchType.EAGER,
		cascade = CascadeType.ALL
	)
	private List<Produit> produits;
	
	// ========== Constructeurs ============
	
	public LigneDeCommande(int idLigneCommande, Commande commande, List<Produit> produits, int quantite) {
		super();
		this.idLigneCommande = idLigneCommande;
		this.commande = commande;
		this.produits = produits;
		this.quantite = quantite;
	}

	public LigneDeCommande() {}
	
	// ========== Getters Et Setters ===========

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Commande getCommande() {
		return commande;
	}
	
	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public String getRefProduit() {
		return refProduit;
	}
	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public long getIdLigneCommande() {
		return idLigneCommande;
	}
	
	public void setIdLigneCommande(int idLigneCommande) {
		this.idLigneCommande = idLigneCommande;
	}
	
	// ============= Helpers Methods =============
	
	public void addProduits(Produit produit) {
		produits.add(produit);
	}
	
	public void removeProduit(Produit produit) {
		produits.remove(produit);
	}
}
