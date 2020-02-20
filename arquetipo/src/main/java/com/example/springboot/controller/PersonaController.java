package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.entity.Persona;
import com.example.springboot.entity.Profesion;
import com.example.springboot.service.PersonaService;

@RestController
@Component
@RequestMapping("/api/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;

	@RequestMapping(path="/{id}", method = RequestMethod.GET)
	public Persona getById(@PathVariable("id") Long id) throws Exception {
		return personaService.get(id);
	}
	
	@RequestMapping(path="/save", method = RequestMethod.POST)
	public @ResponseBody Persona save(@RequestBody Persona persona) throws Exception {
		return personaService.save(persona);
	}	

	@RequestMapping(path="/addprofesiones/{id}", method = RequestMethod.POST)
	public void addProfesiones(@PathVariable("id") Long id, @RequestBody List<Profesion> profesiones) throws Exception {
		personaService.addProfesiones(id, profesiones);
	}
	
}
