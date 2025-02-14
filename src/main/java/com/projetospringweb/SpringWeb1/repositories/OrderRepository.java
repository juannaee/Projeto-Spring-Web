package com.projetospringweb.SpringWeb1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringweb.SpringWeb1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
