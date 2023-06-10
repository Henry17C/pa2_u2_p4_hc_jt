package com.example.demo.estudiante.service;

import com.example.demo.estudiante.repository.modelo.Estudiante;

public interface EstudianteService {
	
	public void insertar(Estudiante estu);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(String cedula);
	public void eliminar(String cedula);


}
