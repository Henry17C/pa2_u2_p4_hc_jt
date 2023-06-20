package com.example.demo.estudiante.service;

import com.example.demo.estudiante.repository.modelo.Autor;

public interface IAutorService {

	
	public void insertar(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscar(Integer id);
	public void eliminar(Integer id);
}
