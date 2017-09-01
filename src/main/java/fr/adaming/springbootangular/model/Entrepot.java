package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue(value = "entrepot")
public class Entrepot extends Batiment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long capacite;
	private List<Magasin> listMagasin;
	private List<Fournisseur> listFournisseur;
	
	public Entrepot() {
		
	}

	@Column(name="capacite")
	public Long getCapacite() {
		return capacite;
	}

	public void setCapacite(Long capacite) {
		this.capacite = capacite;
	}


	@ManyToMany
	public List<Magasin> getListMagasin() {
		return listMagasin;
	}


	public void setListMagasin(List<Magasin> listMagasin) {
		this.listMagasin = listMagasin;
	}


	@ManyToMany
	public List<Fournisseur> getListFournisseur() {
		return listFournisseur;
	}


	public void setListFournisseur(List<Fournisseur> listFournisseur) {
		this.listFournisseur = listFournisseur;
	}

	@Override
	public String toString() {
		return "Entrepot [capacite=" + capacite + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((capacite == null) ? 0 : capacite.hashCode());
		result = prime * result + ((listFournisseur == null) ? 0 : listFournisseur.hashCode());
		result = prime * result + ((listMagasin == null) ? 0 : listMagasin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entrepot other = (Entrepot) obj;
		if (capacite == null) {
			if (other.capacite != null)
				return false;
		} else if (!capacite.equals(other.capacite))
			return false;
		if (listFournisseur == null) {
			if (other.listFournisseur != null)
				return false;
		} else if (!listFournisseur.equals(other.listFournisseur))
			return false;
		if (listMagasin == null) {
			if (other.listMagasin != null)
				return false;
		} else if (!listMagasin.equals(other.listMagasin))
			return false;
		return true;
	}
	
	

}
