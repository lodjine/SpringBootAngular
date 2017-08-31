package fr.adaming.springbootangular.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.springbootangular.model.Entrepot;

public interface IEntrepotDao extends JpaRepository<Entrepot, Serializable>{

}
