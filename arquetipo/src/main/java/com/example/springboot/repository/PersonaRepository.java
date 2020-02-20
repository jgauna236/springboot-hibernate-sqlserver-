package com.example.springboot.repository;

import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Persona;

@Repository("personaRepository")
public class PersonaRepository extends GenericRepository<Persona, Long> {

	public PersonaRepository() {
		super(Persona.class);
	}

}
