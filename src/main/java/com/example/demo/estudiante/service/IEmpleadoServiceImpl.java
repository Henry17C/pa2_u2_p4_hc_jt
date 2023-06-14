package com.example.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.IEmpleadoRepo;
import com.example.demo.estudiante.repository.modelo.Empleado;

@Service
public class IEmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	private IEmpleadoRepo empleadoRepo;

	@Override
	public void insertar(Empleado empl) {
		// TODO Auto-generated method stub
		empleadoRepo.insertar(empl);
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		empleadoRepo.actualizar(empleado);
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return empleadoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		empleadoRepo.eliminar(id);
	}
	

}
