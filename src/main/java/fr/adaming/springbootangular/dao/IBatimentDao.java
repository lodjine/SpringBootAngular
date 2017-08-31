package fr.adaming.springbootangular.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.springbootangular.model.Batiment;

public interface IBatimentDao extends JpaRepository<Batiment, Serializable>{

}
