package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Batiment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idBatiment;
	private String adresse;
	private String nomBatiment;
	private String secteur;
	private String groupe;

	private List<User> listUser;
	private List<Stock> listStock;

	public Batiment() {
	}

	public Batiment(Long idBatiment, String adresse, String nomBatiment, String secteur, String groupe,
			List<User> listUser, List<Stock> listStock) {
		this.idBatiment = idBatiment;
		this.adresse = adresse;
		this.nomBatiment = nomBatiment;
		this.secteur = secteur;
		this.groupe = groupe;
		this.listUser = listUser;
		this.listStock = listStock;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdBatiment() {
		return idBatiment;
	}

	public void setIdBatiment(Long idBatiment) {
		this.idBatiment = idBatiment;
	}

	@Column
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column
	public String getNomBatiment() {
		return nomBatiment;
	}

	public void setNomBatiment(String nomBatiment) {
		this.nomBatiment = nomBatiment;
	}

	@Column
	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	@Column
	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	@OneToMany(mappedBy = "batiment")
	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	@OneToMany(mappedBy = "batiment")
	public List<Stock> getListStock() {
		return listStock;
	}

	public void setListStock(List<Stock> listStock) {
		this.listStock = listStock;
	}

	@Override
	public String toString() {
		return "Batiment [idBatiment=" + idBatiment + ", adresse=" + adresse + ", nomBatiment=" + nomBatiment
				+ ", secteur=" + secteur + ", groupe=" + groupe + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((groupe == null) ? 0 : groupe.hashCode());
		result = prime * result + ((idBatiment == null) ? 0 : idBatiment.hashCode());
		result = prime * result + ((listStock == null) ? 0 : listStock.hashCode());
		result = prime * result + ((listUser == null) ? 0 : listUser.hashCode());
		result = prime * result + ((nomBatiment == null) ? 0 : nomBatiment.hashCode());
		result = prime * result + ((secteur == null) ? 0 : secteur.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batiment other = (Batiment) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (groupe == null) {
			if (other.groupe != null)
				return false;
		} else if (!groupe.equals(other.groupe))
			return false;
		if (idBatiment == null) {
			if (other.idBatiment != null)
				return false;
		} else if (!idBatiment.equals(other.idBatiment))
			return false;
		if (listStock == null) {
			if (other.listStock != null)
				return false;
		} else if (!listStock.equals(other.listStock))
			return false;
		if (listUser == null) {
			if (other.listUser != null)
				return false;
		} else if (!listUser.equals(other.listUser))
			return false;
		if (nomBatiment == null) {
			if (other.nomBatiment != null)
				return false;
		} else if (!nomBatiment.equals(other.nomBatiment))
			return false;
		if (secteur == null) {
			if (other.secteur != null)
				return false;
		} else if (!secteur.equals(other.secteur))
			return false;
		return true;
	}


 	
}
