package com.projetospringweb.SpringWeb1.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringweb.SpringWeb1.entities.CategoryProduct;

public interface CategoryRepository extends JpaRepository<CategoryProduct, Long> {

}
