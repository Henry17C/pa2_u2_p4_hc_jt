package com.example.demo.estudiante.repository;

import com.example.demo.estudiante.repository.modelo.Ciudadano;

public interface ICiudadanoRepo {
	
	public void insertar (Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);
	public void eliminar (Integer id);
	
	
	
}
