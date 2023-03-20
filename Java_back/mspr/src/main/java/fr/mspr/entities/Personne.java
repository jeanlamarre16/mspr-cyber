package fr.mspr.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="personne")
public class Personne {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPersonne;
	
	@Column(name="nom", nullable=false, length=32)
	private String nom;
	
	@Column(name="prenom", nullable=false, length=32)
	private String prenom;
	
	@Column(name="date_naissance", nullable=false)
	private Date dateNaissance;
	
	@Column(name="statut_matrimonial", nullable=true, length=32)
	private String statutMatrimoniale;
	
	@Column(name="sexe", nullable=false, length=32)
	private String sexe;
	
	@Column(name="civilite", nullable=false, length=12)
	private String civilité;
	
	// Ajouter champs : adresse - codePostal - ville - pays - telephone - email, ainsi les employés et les clients pourront hériter des ces attributs
	
	// ============= Constucteurs ================
	
	public Personne(int idPersonne, String nom, String prenom, Date dateNaissance, String civilite, String sexe, String statutMatrimonial ) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	public Personne() {}

	// ============= Getters & Setteers ============

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdPersonne() {
		return idPersonne;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getStatutMatrimoniale() {
		return statutMatrimoniale;
	}

	public String getSexe() {
		return sexe;
	}

	public String getCivilité() {
		return civilité;
	}

	public void setStatutMatrimoniale(String statutMatrimoniale) {
		this.statutMatrimoniale = statutMatrimoniale;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public void setCivilité(String civilité) {
		this.civilité = civilité;
	}
}
