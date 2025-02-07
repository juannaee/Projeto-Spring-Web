package com.projetospringweb.SpringWeb1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetospringweb.SpringWeb1.entities.User;
import com.projetospringweb.SpringWeb1.repositories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll(){
		return userRepository.findAll();
		
	}

}
