package com.example.demo.estudiante.service;

import com.example.demo.estudiante.repository.modelo.Ciudadano;

public interface ICiudadanoService {

	
	public void insertar (Ciudadano ciudadano);
	public void actualizar(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);
	public void eliminar(Integer id);
	
}
