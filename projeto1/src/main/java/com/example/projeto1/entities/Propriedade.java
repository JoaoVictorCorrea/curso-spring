package com.example.projeto1.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Propriedade implements ApplicationListener<ContextRefreshedEvent> {
	
	@Value("${propriedade.nome}")
	private String nome;
	
	@Value("${my.server}")
	private String server;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		System.out.println(nome);
		System.out.println(server);
	}
}
