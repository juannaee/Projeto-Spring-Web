package com.projetospringweb.SpringWeb1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringweb.SpringWeb1.entities.CategoryProduct;
import com.projetospringweb.SpringWeb1.exceptions.ResourceNotFoundException;
import com.projetospringweb.SpringWeb1.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<CategoryProduct> findAll() {
		return categoryRepository.findAll();
	}

	public CategoryProduct findById(Long id) {
		return categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Categoria não encontrada com id: " + id));
	}

}
