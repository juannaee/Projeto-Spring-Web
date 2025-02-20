package com.projetospringweb.SpringWeb1.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetospringweb.SpringWeb1.entities.CategoryProduct;
import com.projetospringweb.SpringWeb1.entities.Order;
import com.projetospringweb.SpringWeb1.entities.Product;
import com.projetospringweb.SpringWeb1.entities.User;
import com.projetospringweb.SpringWeb1.entities.enums.OrderStatus;
import com.projetospringweb.SpringWeb1.repositories.CategoryRepository;
import com.projetospringweb.SpringWeb1.repositories.OrderRepository;
import com.projetospringweb.SpringWeb1.repositories.ProductRepository;
import com.projetospringweb.SpringWeb1.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) {
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		User u1 = new User(null, "Juan", "juan@", "81996272911", "2711114");
		User u2 = new User(null, "Julhia", "Julhia@", "81966272911", "2711114442256");
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Order o1 = new Order(null, Instant.parse("2025-02-14T10:30:45Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2022-03-08T11:47:45Z"), OrderStatus.PAID, u2);
		Order o3 = new Order(null, Instant.parse("2021-01-02T09:30:45Z"), OrderStatus.SHIPPED, u1);
		CategoryProduct cp1 = new CategoryProduct(null, "Tecnologia");

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		Product p1 = new Product(null, "PC Gamer", "Computador de alta qualidade", 7500.00, "pcgamer.com.br");
		Product p2 = new Product(null, "Notebook Ultra", "Notebook leve e potente", 5200.00, "notebookultra.com.br");
		Product p3 = new Product(null, "Monitor 4K", "Monitor UHD para designers e gamers", 1800.00,
				"monitor4k.com.br");
		Product p4 = new Product(null, "Teclado Mecânico", "Teclado mecânico com switches azuis", 350.00,
				"tecladomecanico.com.br");
		Product p5 = new Product(null, "Mouse Gamer", "Mouse com sensor de alta precisão", 250.00, "mousegamer.com.br");
		Product p6 = new Product(null, "Cadeira Ergonômica", "Cadeira confortável para longas sessões de uso", 980.00,
				"cadeiraergonomica.com.br");
		Product p7 = new Product(null, "Monitor UltraWide", "Monitor de alta resolução com tela ampla", 1899.00, "monitorultrawide.com.br");

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////

		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6,p7));
		categoryRepository.saveAll(Arrays.asList(cp1));
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

	}

}
