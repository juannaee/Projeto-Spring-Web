package com.projetospringweb.SpringWeb1.resources;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetospringweb.SpringWeb1.entities.User;
import com.projetospringweb.SpringWeb1.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	private final UserService userService;

	//@Autowired não é mais necessario usar
	public UserResource(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Endpoint para testes via Postman. URL: http://localhost:8080/users Método:
	 * GET
	 * 
	 * Retorna a lista de todos os usuários cadastrados.
	 */
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> listUser = userService.findAll();
		return ResponseEntity.ok().body(listUser);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {

		User obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);

	}

}
