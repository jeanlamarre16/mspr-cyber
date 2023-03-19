package fr.mspr.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "commande")
public class Commande {
	@Id
	@Column(name="id_commande")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="ref_commande", nullable=false, length=9)
	private String refCommande;
	
	/*@OneToOne
	@PrimaryKeyJoinColumn(name="id_commande", referencedColumnName="id_employe")
	private Long idEmploye;
	*/
	
	@Column(name="id_client", nullable=false)
	private Long idClient;
	
	@ManyToMany
	private List<Produit> produits;
	
	// ========== Constructeurs ============
	
	public Commande(long id, String refCommande, Long idEmploye, Long idClient,	List<Produit> produits) {
		super();
		this.id = id;
		this.refCommande = refCommande;
		//this.idEmploye = idEmploye;
		this.idClient = idClient;
		this.produits = produits;
	}

	public Commande() {}
	
	// ========== Getters Et Setters ===========
	
	/*public Long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		this.idEmploye = idEmploye;
	}
*/
	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public void setRefCommande(String refCommande) {
		this.refCommande = refCommande;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRefCommande() {
		return refCommande;
	}
	public void setRefProduit(String refCommande) {
		this.refCommande = refCommande;
	}
}
