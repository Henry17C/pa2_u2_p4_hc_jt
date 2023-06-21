package com.example.demo.estudiante.repository;

import com.example.demo.estudiante.repository.modelo.Matricula;

public interface IMatriculaRepo {
	
	
	public void insertar(Matricula matricula);
	public void actualizar (Matricula matricula);
	public Matricula buscar(Integer  id);
	public void eliminar(Integer id);
	
	
}
