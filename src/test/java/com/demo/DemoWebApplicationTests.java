package com.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.demo.model.Usuario;
import com.demo.repo.IUsuarioRepo;

@SpringBootTest
class DemoWebApplicationTests {
	@Autowired
	private BCryptPasswordEncoder coder;
	
	@Autowired
	private IUsuarioRepo repo;
		
	@Test
	void crearUsuario() {
		Usuario us = new Usuario();
		us.setId(6);
		us.setNombre("miguel");
		us.setClave(coder.encode("12345"));
		Usuario retorno = repo.save(us);
		
		assertTrue(retorno.getClave().equals(us.getClave()));
	}

}
