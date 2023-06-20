package com.example.demo.estudiante.service;

import com.example.demo.estudiante.repository.modelo.Libro;

public interface ILibroService {
	
	public void insertar (Libro libro);
	public void actualizar(Libro libro);
	public Libro buscar (Integer id);
	public void elimnar(Integer id);
	

}
