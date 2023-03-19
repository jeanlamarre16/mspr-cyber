package fr.mspr.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	@Id
	@Column(name="id_produit")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProduit;
	
	@Column(name="ref_produit", nullable=false, length=9)
	private String refProduit;
	
	@Column(name="nom_produit", nullable=false, length=32)
	private String nomProduit;
	
	@Column(name="marque", nullable=false, length=32)
	private String marque;
	
	@Column(name="categorie", nullable=false, length=25)
	private String categorieProduit;
	
	@Column(name="couleur", nullable=false, length=25)
	private String couleur;
	
	@Column(name="type_materiau", nullable=false, length=32)
	private String materiau;
	
	@Column(name="url_image", nullable=false)
	private String url;
	
	@Column(name="prix", nullable=false)
	private float prix;
	
	@Column(name="stock_disponible", nullable=false)
	private int stock;
	
	@Column(name="origine", nullable=false, length=32)
	private String origine;
	
	@ManyToMany(mappedBy = "produits")
	private List<LigneDeCommande> ligneDeCommande = new ArrayList<>();

	// ========= Constructeur ===========

	public void setLigneDeCommande(List<LigneDeCommande> ligneDeCommande) {
		this.ligneDeCommande = ligneDeCommande;
	}

	public Produit(int idProduit, String refProduit, String nomProduit, String categorieProduit, 
			String marque, String couleur, String materiau, String url, float prix, int stock, String origine) {
		super();
		this.idProduit = idProduit;
		this.refProduit = refProduit;
		this.nomProduit = nomProduit;
		this.marque = marque;
		this.categorieProduit = categorieProduit;
		this.couleur = couleur;
		this.materiau = materiau;
		this.url = url;
		this.prix = prix;
		this.stock = stock;
		this.origine = origine;
	}

	public Produit() {}
	
	// ========= Getters =========
	
	public String getCouleur() {
		return couleur;
	}
	
	public long getIdProduit() {
		return idProduit;
	}

	public String getRefProduit() {
		return refProduit;
	}

	public String getMateriau() {
		return materiau;
	}

	public List<LigneDeCommande> getLigneDeCommande() {
		return ligneDeCommande;
	}
	
	public String getNomProduit() {
		return nomProduit;
	}
	
	public String getUrl() {
		return url;
	}

	public String getCategorieProduit() {
		return categorieProduit;
	}

	public int getStock() {
		return stock;
	}
	
	public float getPrix() {
		return prix;
	}
	
	public String getOrigine() {
		return origine;
	}
	
	public String getMarque() {
		return marque;
	}

	// ========= Setters =========
	
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public void setCategorieProduit(String categorieProduit) {
		this.categorieProduit = categorieProduit;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}
	
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public void setMateriau(String materiau) {
		this.materiau = materiau;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}
	
// =============== Methodes du processus métier ================
	
	public void renflouerStock(int qt) {
		this.stock += qt;
	}
	
	public void commanderProduit(int qt) throws Exception {
		if(qt > stock) {
			throw new Exception ("Quantité non disponible");
		} else {
			this.stock -= stock;
		}
	}
	
	/* 
	 *  A VERIFIER : Vérifier la suppression d'un produit entraine automatiquement sa suppresion dans la ligne des commandes. 
	 *  SINON : A implémenter
	 * 
	 */
	
}
