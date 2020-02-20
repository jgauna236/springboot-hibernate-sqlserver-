package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.Persona;
import com.example.springboot.entity.Profesion;
import com.example.springboot.repository.GenericRepository;
import com.example.springboot.repository.PersonaRepository;

@Service("personaService")
public class PersonaService extends GenericService<Persona, Long>{

	@Autowired
	private transient PersonaRepository personaRepository;
	
	@Override
	public GenericRepository<Persona, Long> getRepository() {
		return this.personaRepository;
	}

	public void addProfesiones(Long id, List<Profesion> profesiones) throws Exception {
		Persona persona;
		try {
			persona = personaRepository.get(id);
			persona.getProfesiones().addAll(profesiones);
			personaRepository.update(persona);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	

}
