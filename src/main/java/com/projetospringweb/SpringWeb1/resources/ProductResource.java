package com.projetospringweb.SpringWeb1.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetospringweb.SpringWeb1.entities.Product;
import com.projetospringweb.SpringWeb1.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	private final ProductService productService;

	public ProductResource(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {

		List<Product> listProduct = productService.findAll();
		return ResponseEntity.ok().body(listProduct);

	}

}
