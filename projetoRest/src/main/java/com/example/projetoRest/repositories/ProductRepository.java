package com.example.projetoRest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoRest.entitities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
