package com.projetospringweb.SpringWeb1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringweb.SpringWeb1.entities.User;
import com.projetospringweb.SpringWeb1.exceptions.ResourceNotFoundException;
import com.projetospringweb.SpringWeb1.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();

	}

	public User findById(Long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado com id: " + id));
	}

}
