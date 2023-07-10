package com.example.projetoRest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoRest.entitities.Product;
import com.example.projetoRest.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	// GET - Retorna apenas um Produto através do ID - /products/{id}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Product> find(@PathVariable Long id) {
		
		return productRepository.findById(id);
	}
	
	// GET - Retorna todos os Produtos - /products
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Product> findAll() {
		
		return productRepository.findAll();
	}
	
	// POST - Salva apenas um Produto - /products
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Product save(@RequestBody Product product) {
		
		return productRepository.save(product);
	}
	
	// PUT - Atualiza apenas um Produto - /products
	@RequestMapping(value = "", method = RequestMethod.PUT)
	public Product update(@RequestBody Product product) {
		
		return productRepository.save(product);
	}
	
	// DELETE - Deleta apenas um Produto através do ID - /products/{id}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		
		productRepository.deleteById(id);
	}
}
