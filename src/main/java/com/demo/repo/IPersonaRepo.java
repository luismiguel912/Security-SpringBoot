package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	

}
