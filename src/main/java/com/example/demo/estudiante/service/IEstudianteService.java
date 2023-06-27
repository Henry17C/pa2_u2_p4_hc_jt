package com.example.demo.estudiante.service;



import java.util.List;

import com.example.demo.estudiante.repository.modelo.Estudiante;

public interface IEstudianteService {
	public Estudiante buscarPorApellido(String apellido);
	public void insertar (Estudiante estudiante);	
	public List<Estudiante> reporteEstudiantes(String apellido);
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre);
	public Estudiante seleccionarPorApellidoTyped(String apellido);

	
	
	

}