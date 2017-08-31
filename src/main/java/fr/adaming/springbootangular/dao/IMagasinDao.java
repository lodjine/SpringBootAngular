package fr.adaming.springbootangular.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.springbootangular.model.Magasin;

public interface IMagasinDao extends JpaRepository<Magasin, Serializable> {

}
