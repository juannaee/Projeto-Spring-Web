package com.projetospringweb.SpringWeb1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringweb.SpringWeb1.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
