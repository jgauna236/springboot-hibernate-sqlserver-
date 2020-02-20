package com.example.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity(name="PERSONA")
public class Persona {
	
	@Id
	private Long dni;
	
	private String nombre;
	
	private String apellido;

	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "PERSONA_PROFESION", 
	         joinColumns = { @JoinColumn(name = "PERSONA_DNI") }, 
	         inverseJoinColumns = { @JoinColumn(name = "PROFESION_NOMBRE") })
    private List<Profesion> profesiones;
    
	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Profesion> getProfesiones() {
		return profesiones;
	}

	public void setProfesiones(List<Profesion> profesiones) {
		this.profesiones = profesiones;
	}

}
