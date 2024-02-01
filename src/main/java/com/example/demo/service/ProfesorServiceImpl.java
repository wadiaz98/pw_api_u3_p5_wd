package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProfesorRepository;
import com.example.demo.repository.modelo.Profesor;

@Service
public class ProfesorServiceImpl implements IProfesorService{
	
	@Autowired
	private IProfesorRepository profesorRepository;

	@Override
	public void guardar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.profesorRepository.insertar(profesor);
	}

	@Override
	public void actualizar(Profesor profesor) {
		// TODO Auto-generated method stub
		this.profesorRepository.actualizar(profesor);
	}

	@Override
	public void actualizarParcial(String asignatura, Integer id) {
		// TODO Auto-generated method stub
		this.profesorRepository.actualizarParcial(asignatura, id);
	}

	@Override
	public Profesor consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.profesorRepository.seleccionar(id);
	}

	@Override
	public List<Profesor> consultarTodos(String genero) {
		// TODO Auto-generated method stub
		return this.profesorRepository.seleccionarTodos(genero);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.profesorRepository.eliminar(id);
	}

}
