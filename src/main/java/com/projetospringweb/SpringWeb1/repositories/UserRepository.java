package com.projetospringweb.SpringWeb1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospringweb.SpringWeb1.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	

}
