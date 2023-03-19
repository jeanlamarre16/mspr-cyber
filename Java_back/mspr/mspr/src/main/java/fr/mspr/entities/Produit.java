package fr.mspr.entities;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	@Id
	@Column(name="id_commande")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="ref_produit", nullable=false, length=9)
	private String refProduit;
	
	@Column(name="nom_produit", nullable=false, length=32)
	private String nomProduit;
	
	@Column(name="categorie", nullable=false, length=25)
	private String categorieProduit;
	
	@Column(name="couleur", nullable=false, length=25)
	private String couleur;
	
	@Column(name="type-materiau", nullable=false, length=32)
	private String materiau;
	
	@Column(name="url_image", nullable=false)
	private String url;
	
	@Column(name="prix", nullable=false)
	private float prix;
	
	@Column(name="stock_disponible", nullable=false)
	private int stock;
	
	@Column(name="origine", nullable=false, length=32)
	private String origine;

	// ========= Constructeur ===========
	
	public Produit(long id, String refProduit, String nomProduit, String categorieProduit, 
			String couleur, String materiau, String url, float prix, int stock, String origine) {
		super();
		this.id = id;
		this.refProduit = refProduit;
		this.nomProduit = nomProduit;
		this.categorieProduit = categorieProduit;
		this.couleur = couleur;
		this.materiau = materiau;
		this.url = url;
		this.prix = prix;
		this.stock = stock;
		this.origine = origine;
	}
	
	public Produit() {}
	
	// ========= Getters et Setters =========
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getCategorieProduit() {
		return categorieProduit;
	}

	public void setCategorieProduit(String categorieProduit) {
		this.categorieProduit = categorieProduit;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getMateriau() {
		return materiau;
	}

	public void setMateriau(String materiau) {
		this.materiau = materiau;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int stock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}
	
	public void renflouerStock(int qt) {
		this.stock += qt;
	}
	
	public void vendre(int qt) {
		this.stock -= stock;
	}
}
