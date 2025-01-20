package com.projetospringweb.SpringWeb1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetospringweb.SpringWeb1.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Juan", "juangsilvalemos", "10488775400", "81996272911");
		return ResponseEntity.ok().body(u);

	}

}
