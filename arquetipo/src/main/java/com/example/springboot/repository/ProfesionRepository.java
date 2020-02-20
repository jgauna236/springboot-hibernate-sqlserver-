package com.example.springboot.repository;

import org.springframework.stereotype.Repository;

import com.example.springboot.entity.Profesion;

@Repository("profesionRepository")
public class ProfesionRepository extends GenericRepository<Profesion,String>{

	public ProfesionRepository() {
		super(Profesion.class);
	}

}
