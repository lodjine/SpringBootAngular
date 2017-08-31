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
	
	

}
