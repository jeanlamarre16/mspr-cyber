package fr.mspr.entities;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	@Id
	@Column(name="idClient")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idClient;
	
	@Column(name="ref_client", nullable=false, length=9)
	private String refClient;
	
	@Column(name="nom_client", nullable=false, length=32)
	private String nomClient;
	
	@Column(name="prenom_client", nullable=false, length=32)
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
	
	@Column(name="telephone", nullable=false, length=12)
	private String telephone;
	
	// ============ Constructeurs =================
	
	public Client(Long idClient, String refClient, String nomClient, String prenomClient, String adresse,
			String codePostal, String ville, String pays, String email, String telephone) {
		super();
		this.idClient = idClient;
		this.refClient = refClient;
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

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getRefClient() {
		return refClient;
	}

	public void setRefClient(String refClient) {
		this.refClient = refClient;
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
}
