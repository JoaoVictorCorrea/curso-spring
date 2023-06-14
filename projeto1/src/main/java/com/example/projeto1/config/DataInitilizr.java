package com.example.projeto1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.projeto1.entities.User;
import com.example.projeto1.repository.UserRepository;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent>  {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		//createUser("Davi", "davi@gmail.com");
		
		/* busca um registro do banco com getOne(), busca pelo id
		User user = userRepository.getOne(2L);
		System.out.println(user.getName()); */
		
		/* deletar um registro do banco com deleteById(), deleta pelo id
		userRepository.deleteById(2L); */
		
		/* alterar um registro do banco com usando o getOne() para pegá-lo e save() para salvá-lo alterado
		User user = userRepository.getOne(4L);
		user.setName("Matheus");
		userRepository.save(user); */
		
		/* busca um registro do banco com findByName, busca pelo nome
		User user = userRepository.findByName("João");
		System.out.println(user.getName()); */
		
		/* busca um registro do banco com findByNameContains, busca pela string dada
		User user = userRepository.findByNameContains("Jo");
		System.out.println(user.getName()); */
	}
	
	public void createUser(String name, String email) {
		
		User user = new User(name, email);
		
		userRepository.save(user);
	}
}