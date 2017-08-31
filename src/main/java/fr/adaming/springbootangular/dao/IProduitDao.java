package fr.adaming.springbootangular.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.springbootangular.model.Produit;

public interface IProduitDao extends JpaRepository<Produit, Serializable> {
	
}
