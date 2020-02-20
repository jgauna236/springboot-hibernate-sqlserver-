package com.example.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name="PROFESION")
public class Profesion{
	
	@Id
	private String nombre;
	
	@ManyToMany(mappedBy = "profesiones", cascade= CascadeType.ALL)
	private List<Persona> personas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
}