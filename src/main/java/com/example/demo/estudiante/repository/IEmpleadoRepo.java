package com.example.demo.estudiante.repository;

import com.example.demo.estudiante.repository.modelo.Empleado;

public interface IEmpleadoRepo {
	
	public void insertar (Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void eliminar (Integer id);
	

}
