package com.projetospringweb.SpringWeb1.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetospringweb.SpringWeb1.entities.CategoryProduct;
import com.projetospringweb.SpringWeb1.service.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	private final CategoryService categoryService;

	public CategoryResource(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping
	public ResponseEntity<List<CategoryProduct>> findAll() {
		List<CategoryProduct> listCategories = categoryService.findAll();
		return ResponseEntity.ok().body(listCategories);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryProduct> findById(@PathVariable Long id) {
		CategoryProduct obj = categoryService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
