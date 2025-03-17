package com.educandoweb.course.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

/*Anotação para registrar o UserService como componente do Spring, assim é possível injetar automaticamente com @Autowired no UserResource
  Tem específicas, no caso vamos usar a Service 
	@Component 
	@Repository
*/

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll (){
		return repository.findAll();
	}
	
	public User findById (Long id){
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
}
