package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test") //referenciando ao nome de profile que foi dado no arquivo "application.properties"
public class testConfig implements CommandLineRunner {
	
	@Autowired //Essa anotação o proprio spring resolve a dependencia e associar uma instancia UserRepository aqui dentro
	private UserRepository userRespository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRespository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
