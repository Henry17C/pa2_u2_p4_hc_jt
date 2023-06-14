package com.example.demo.estudiante.service;

import com.example.demo.estudiante.repository.modelo.Empleado;

public interface IEmpleadoService {
	
	public void insertar (Empleado empl); 
	public void actualizar (Empleado empleado);
	public Empleado buscar(Integer id);
	public void eliminar (Integer id);
	

}
