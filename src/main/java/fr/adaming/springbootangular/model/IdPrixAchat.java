package fr.adaming.springbootangular.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IdPrixAchat implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idF;
	private Long idP;
	
	public IdPrixAchat() {
	
	}
	
	public IdPrixAchat(Long idF, Long idP) {
		super();
		this.idF = idF;
		this.idP = idP;
	}

	@Column(name="idF")
	public Long getIdF() {
		return idF;
	}

	public void setIdF(Long idF) {
		this.idF = idF;
	}

	@Column(name="idP")
	public Long getIdP() {
		return idP;
	}

	public void setIdP(Long idP) {
		this.idP = idP;
	}

	@Override
	public String toString() {
		return "IdPrixAchat [idF=" + idF + ", idP=" + idP + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idF == null) ? 0 : idF.hashCode());
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
		IdPrixAchat other = (IdPrixAchat) obj;
		if (idF == null) {
			if (other.idF != null)
				return false;
		} else if (!idF.equals(other.idF))
			return false;
		if (idP == null) {
			if (other.idP != null)
				return false;
		} else if (!idP.equals(other.idP))
			return false;
		return true;
	}
	
	

}
