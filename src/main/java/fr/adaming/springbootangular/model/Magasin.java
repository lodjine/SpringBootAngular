package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue(value = "Magasin")
public class Magasin extends Batiment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Entrepot> listEntrepot = new ArrayList<>();
	

	public Magasin() {
		super();
	}


	public Magasin(List<Entrepot> listEntrepot) {
		super();
		this.listEntrepot = listEntrepot;
	}

	
	@ManyToMany(mappedBy="listMagasin")
	public List<Entrepot> getListEntrepot() {
		return listEntrepot;
	}


	public void setListEntrepot(List<Entrepot> listEntrepot) {
		this.listEntrepot = listEntrepot;
	}


	@Override
	public String toString() {
		return "Magasin [" 
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((listEntrepot == null) ? 0 : listEntrepot.hashCode());
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
		Magasin other = (Magasin) obj;
		if (listEntrepot == null) {
			if (other.listEntrepot != null)
				return false;
		} else if (!listEntrepot.equals(other.listEntrepot))
			return false;
		return true;
	}
	
}
