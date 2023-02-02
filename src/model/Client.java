package model;

import java.io.Serializable;

public class Client implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String email;
	private String dateNaissance;
	private String telephone;
	private String sexe;
	private String mdp;
	private String pays;
	private String langages;

	public Client() {
	}

	public Client(String nom, String prenom, String email, String dateNaissance, String telephone, String sexe,
			String mdp, String pays, String langages) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateNaissance = dateNaissance;
		this.telephone = telephone;
		this.sexe = sexe;
		this.mdp = mdp;
		this.pays = pays;
		this.langages = langages;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public String getLangages() {
		return langages;
	}

	public String getMdp() {
		return mdp;
	}

	public String getNom() {
		return nom;
	}

	public String getPays() {
		return pays;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLangages(String langages) {
		this.langages = langages;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Client  [nom = " + nom + "]";
	}

}
