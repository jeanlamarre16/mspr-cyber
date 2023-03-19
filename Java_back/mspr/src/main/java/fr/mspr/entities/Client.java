package fr.mspr.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	@Id
	@Column(name="id_client")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClient;
	
	@Column(name="numero_client", nullable=false, length=9)
	private String numeroClient;
	
	@Column(name="nom_client", nullable=false, length=32)
	private String nomClient;
	
	@Column(name="prenom_client", length=32)
	private String prenomClient;
	
	@Column(name="adresse", nullable=false, length=80)
	private String adresse;
	
	@Column(name="code_postal", nullable=false, length=12)
	private String codePostal;
	
	@Column(name="ville", nullable=false, length=32)
	private String ville;
	
	@Column(name="pays", nullable=false, length=32)
	private String pays;
	
	@Column(name="email", nullable=false, length=80)
	private String email;
	
	@Column(name="telephone", nullable=false, length=20)
	private String telephone;
	
	@OneToMany(
		mappedBy="client",
		orphanRemoval = true, 
		fetch = FetchType.EAGER
	)
	private List<LigneDeCommande> listeCommandes = new ArrayList<>();
	
	// ============ Constructeurs =================

	public Client(int idClient, String numeroClient, String nomClient, String prenomClient, String adresse,
			String codePostal, String ville, String pays, String email, String telephone) {
		super();
		this.idClient = idClient;
		this.numeroClient = numeroClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.email = email;
		this.telephone = telephone;
	}
	
	public Client(){}
	
	// ============== Getters & Setters ================

	public long getIdClient() {
		return idClient;
	}
	
	public List<LigneDeCommande> getListeCommandes() {
		return listeCommandes;
	}

	public void setListeCommandes(List<LigneDeCommande> listCommandes) {
		this.listeCommandes = listCommandes;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(String numeroClient) {
		this.numeroClient = numeroClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	// ============= Helpers Methods =================
	
	public void addLigneCommande(LigneDeCommande ldc) {
		listeCommandes.add(ldc);
	}
	
	public void removeLigneCommande(LigneDeCommande ldc) {
		listeCommandes.remove(ldc);
	}
}
