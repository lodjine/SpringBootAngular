package fr.adaming.springbootangular.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.springbootangular.model.Profil;

public interface IProduitDao extends JpaRepository<Profil, Serializable> {
	
}
