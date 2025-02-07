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

	/*
	 * Optei por não retornar Optional<User> e, em vez disso, lançar uma exceção
	 * personalizada como ResourceNotFoundException. Essa abordagem é mais adequada
	 * para APIs REST, pois permite retornar uma resposta HTTP apropriada, como o
	 * status 404 (Not Found), quando o recurso não é encontrado. Assim, elimino a
	 * necessidade de verificar manualmente se o valor está presente com Optional,
	 * proporcionando um código mais limpo e sem verificações adicionais. Essa
	 * prática melhora a clareza e o controle do fluxo de erros, tornando o código
	 * mais alinhado com as melhores práticas de APIs REST no que diz respeito ao
	 * tratamento de exceções.
	 */

	// public Optional<User> findById(Long id) {
//	     return userRepository.findById(id);
	// }

	/*
	 * Optei por usar a abordagem de lançar uma exceção personalizada
	 * (ResourceNotFoundException) ao invés de retornar um Optional<User>. Essa
	 * escolha foi feita porque, em APIs REST, é uma prática comum lançar exceções
	 * HTTP adequada (por exemplo, 404 - Not Found) quando um recurso não é
	 * encontrado. Isso elimina a necessidade de verificações adicionais de presença
	 * do valor e torna o código mais limpo e direto. Além disso, o uso de exceções
	 * personalizadas facilita o tratamento centralizado de erros e melhora a
	 * comunicação com o cliente, indicando claramente o motivo do erro, ao invés de
	 * apenas retornar um valor nulo ou vazio.
	 */

	public User findById(Long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado com id: " + id));
	}

}
