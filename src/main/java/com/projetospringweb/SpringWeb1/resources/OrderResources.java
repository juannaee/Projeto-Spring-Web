package com.projetospringweb.SpringWeb1.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetospringweb.SpringWeb1.entities.Order;
import com.projetospringweb.SpringWeb1.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

	private final OrderService orderService;

	// @Autowired não é mais necessario usar
	public OrderResources(OrderService orderService) {
		this.orderService = orderService;
	}

	/**
	 * Endpoint para testes via Postman. URL: http://localhost:8080/orders Método:
	 * GET
	 * 
	 * Retorna a lista de todas as vendas cadastrados.
	 */

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> listOrder = orderService.findAll();
		return ResponseEntity.ok().body(listOrder);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {

		Order obj = orderService.findById(id);
		return ResponseEntity.ok().body(obj);

	}

}
