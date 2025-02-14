package com.projetospringweb.SpringWeb1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringweb.SpringWeb1.entities.Order;
import com.projetospringweb.SpringWeb1.exceptions.ResourceNotFoundException;
import com.projetospringweb.SpringWeb1.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();

	}

	public Order findById(Long id) {
		return orderRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Venda não encontrada com id: " + id));

	}

}
