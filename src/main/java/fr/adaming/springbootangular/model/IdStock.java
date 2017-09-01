package fr.adaming.springbootangular.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdStock implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idP;
	private Long idB;

	public IdStock() {
	}

	public IdStock(Long idP, Long idB) {
		this.idP = idP;
		this.idB = idB;
	}

	@Column
	public Long getIdP() {
		return idP;
	}

	public void setIdP(Long idP) {
		this.idP = idP;
	}

	@Column
	public Long getIdB() {
		return idB;
	}

	public void setIdB(Long idB) {
		this.idB = idB;
	}

	@Override
	public String toString() {
		return "IdStock [idP=" + idP + ", idB=" + idB + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idB == null) ? 0 : idB.hashCode());
		result = prime * result + ((idP == null) ? 0 : idP.hashCode());
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
		IdStock other = (IdStock) obj;
		if (idB == null) {
			if (other.idB != null)
				return false;
		} else if (!idB.equals(other.idB))
			return false;
		if (idP == null) {
			if (other.idP != null)
				return false;
		} else if (!idP.equals(other.idP))
			return false;
		return true;
	}

	
}
