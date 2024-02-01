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
	
	@PostMapping(path = "/guardar")
	public void guardar(@RequestBody Profesor profesor) {
		this.profesorService.guardar(profesor);
	}
	
	@GetMapping(path = "/consultarTodos")
	public List<Profesor> consultarTodos(@RequestParam String genero) {
		return this.profesorService.consultarTodos(genero);
	}
	
	@GetMapping(path = "/consultar/{id}")
	public Profesor consultar(@PathVariable Integer id) {
		return this.profesorService.consultar(id);
	}
	
	@PutMapping(path = "/actualizar")
	public void actualizar(@RequestBody Profesor profesor) {
		this.profesorService.actualizar(profesor);
	}
	
	@PatchMapping(path = "/actualizarParcial")
	public void actualizarParcial(@RequestBody Profesor profesor) {
		this.profesorService.actualizarParcial(profesor.getAsignatura(), profesor.getId());
	}
	
	@DeleteMapping(path = "/borrar/{id}")
	public void eliminar(@PathVariable Integer id) {
		this.profesorService.borrar(id);
	}
}
