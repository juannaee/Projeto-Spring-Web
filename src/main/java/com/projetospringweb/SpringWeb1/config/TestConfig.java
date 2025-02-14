package com.projetospringweb.SpringWeb1.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetospringweb.SpringWeb1.entities.Order;
import com.projetospringweb.SpringWeb1.entities.User;
import com.projetospringweb.SpringWeb1.repositories.OrderRepository;
import com.projetospringweb.SpringWeb1.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) {
		User u1 = new User(null, "Juan", "juan@", "81996272911", "2711114");
		User u2 = new User(null, "Julhia", "Julhia@", "81966272911", "2711114442256");
		Order o1 = new Order(null, Instant.parse("2025-02-14T10:30:45Z"), u1);
		Order o2 = new Order(null, Instant.parse("2022-03-08T11:47:45Z"), u2);
		Order o3 = new Order(null, Instant.parse("2021-01-02T09:30:45Z"), u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}

}
