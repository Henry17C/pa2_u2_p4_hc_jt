package com.example.demo.estudiante.repository;

import com.example.demo.estudiante.repository.modelo.Habitacion;

public interface IHabitacionRepo {
	
	
	public void insertar (Habitacion habitacion);
	public void actualizar(Habitacion habitacion);
	public Habitacion buscar (Integer id);
	public void eliminar(Integer id);
	

}
