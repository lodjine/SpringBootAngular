package fr.adaming.springbootangular.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.springbootangular.model.Categorie;

public interface ICategorieDao extends JpaRepository<Categorie, Serializable>{

}
