package com.projetospringweb.SpringWeb1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringweb.SpringWeb1.entities.Product;
import com.projetospringweb.SpringWeb1.exceptions.ResourceNotFoundException;
import com.projetospringweb.SpringWeb1.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product findById(Long id) {
		return productRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado com id: " + id));
	}

}
