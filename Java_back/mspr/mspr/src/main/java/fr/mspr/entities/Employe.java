package fr.mspr.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="employe")
@Entity
public class Employe {
	@Id
	@Column(name="id_employe")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nom", nullable=false, length=32)
	private String nom;
	
	@Column(name="prenom", nullable=false, length=32)
	private String prenom;
	
	@Column(name="service", nullable=false, length=32)
	private String service;
	
	@Column(name="poste", nullable=false, length=9)
	private String poste;
	
	@Column(name="date_embauche", nullable=false)
	private Date dateEmbauche;
	
	@Column(name="identifiant", nullable=false, length=9)
	private String identifiant;
	
	@Column(name="mot_de_passe", nullable=false)
	private String password;
	
	@Column(name="role", nullable=false, length=32)
	private String role;

	// ============= Constucteurs ================
	
	public Employe(Long id, String nom, String prenom, String service, String poste, Date dateEmbauche,
			String identifiant, String password, String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.service = service;
		this.poste = poste;
		this.dateEmbauche = dateEmbauche;
		this.identifiant = identifiant;
		this.password = password;
		this.role = role;
	}
	
	public Employe() {}

	// ============= Getters & Setteers ============
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getPass() {
		return password;
	}

	public void setPass(String pass) {
		this.password = pass;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
