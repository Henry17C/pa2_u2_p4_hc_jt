package com.example.demo.estudiante.repository;

import java.util.List;

import com.example.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteRepo {
	
	
	public Estudiante seleccionarPorApellido(String apellido);
	public void insertar (Estudiante estudiante);	

	public List<Estudiante> seleccionarListaPorApellido(String apellido);
	
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre);

	
	public Estudiante seleccionarPorApellidoTyped(String apellido);

}
