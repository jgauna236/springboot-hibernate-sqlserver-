package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.ProfesionService;

@RestController
@Component
@RequestMapping("/api/profesion")
public class ProfesionController {
	
	@Autowired
	private ProfesionService profesionService;
	
	

}
