package com.example.springboot.service;

import org.springframework.stereotype.Service;

import com.example.springboot.entity.Profesion;
import com.example.springboot.repository.GenericRepository;
import com.example.springboot.repository.ProfesionRepository;

@Service("profesionService")
public class ProfesionService extends GenericService<Profesion, String> {
	
	private ProfesionRepository profesionRepository;
	
	@Override
	public GenericRepository<Profesion, String> getRepository() {
		return this.profesionRepository;
	}

}
