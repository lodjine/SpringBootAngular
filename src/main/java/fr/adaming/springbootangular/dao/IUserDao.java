package fr.adaming.springbootangular.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.adaming.springbootangular.model.User;

public interface IUserDao extends JpaRepository<User, Serializable>{
	
	@Query("select u from User u where u.pseudo = :x and u.password = :y ")
	public User userParLogin(@Param("x")String log, @Param("y")String password );

}
