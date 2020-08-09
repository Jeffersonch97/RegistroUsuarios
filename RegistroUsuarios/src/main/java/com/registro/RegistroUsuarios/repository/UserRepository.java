package com.registro.RegistroUsuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.registro.RegistroUsuarios.entities.User;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long>{
	public Optional<User> findByUsername(String	username);

}
