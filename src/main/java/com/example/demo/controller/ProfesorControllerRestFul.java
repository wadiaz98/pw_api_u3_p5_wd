package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Profesor;
import com.example.demo.service.IProfesorService;

@RestController
@RequestMapping(path = "/profesores")
public class ProfesorControllerRestFul {
	
	@Autowired
	private IProfesorService profesorService;
	
	@PostMapping
	public void guardar(@RequestBody Profesor profesor) {
		this.profesorService.guardar(profesor);
	}
	
	@GetMapping
	public List<Profesor> consultarTodos(@RequestParam(required = false, defaultValue = "M") String genero) {
		return this.profesorService.consultarTodos(genero);
	}
	
	@GetMapping(path = "/{id}")
	public Profesor consultar(@PathVariable Integer id) {
		return this.profesorService.consultar(id);
	}
	
	@PutMapping(path = "/{id}")
	public void actualizar(@RequestBody Profesor profesor, @PathVariable Integer id) {
		profesor.setId(id);
		this.profesorService.actualizar(profesor);
	}
	
	@PatchMapping(path = "/{id}")
	public void actualizarParcial(@RequestBody Profesor profesor, @PathVariable Integer id) {
		this.profesorService.actualizarParcial(profesor.getAsignatura(), id);
	}
	
	@DeleteMapping(path = "/{id}")
	public void eliminar(@PathVariable Integer id) {
		this.profesorService.borrar(id);
	}
}
