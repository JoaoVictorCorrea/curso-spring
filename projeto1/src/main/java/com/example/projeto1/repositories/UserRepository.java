package com.example.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.projeto1.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//Todo método com findBy'Nome de um atributo da classe' busca pelo atributo da classe
	User findByName(String name);
	
	//Querys como JPQL
	@Query("SELECT u FROM User u WHERE u.name like %:name%")
	User findByNameContains(String name);
}
