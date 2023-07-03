package com.example.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto1.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
