package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;

//Una API puede tener muchos servicios
//API: determinada por el proyecto Java
//Un servicio tiene muchas capacidades
//Con una clase controller se implementa un controlador rest en una API
//Servicio -> Controller: Clase controller

@RestController // Servicio

public class EstudianteControllerRestFul {

	// Métodos: Capacidades
	public void guardar(Estudiante estudiante) {

	}

}
