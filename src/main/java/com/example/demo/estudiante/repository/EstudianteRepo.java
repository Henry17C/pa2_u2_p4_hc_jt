package com.example.demo.estudiante.repository;

import com.example.demo.estudiante.repository.modelo.Estudiante;

public interface EstudianteRepo {
	
	
	public void insertar(Estudiante estu);
	public void actualizar(Estudiante estudiante);
	public Estudiante buscar(String cedula);
	public void eliminar(String cedula);

}
