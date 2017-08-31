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

}
