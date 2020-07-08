package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	//select * from usuario where nombre = "nombre"
	Usuario findByNombre(String nombre);

}
