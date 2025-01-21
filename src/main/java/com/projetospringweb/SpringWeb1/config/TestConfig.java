package com.projetospringweb.SpringWeb1.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetospringweb.SpringWeb1.entities.User;
import com.projetospringweb.SpringWeb1.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) {
		User u1 = new User(null, "Juan", "juan@", "81996272911", "2711114");
		User u2 = new User(null, "Julhia", "Julhia@", "81966272911", "2711114442256");

		userRepository.saveAll(Arrays.asList(u1, u2));

	}

}
