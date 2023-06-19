package com.example.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.IHabitacionRepo;
import com.example.demo.estudiante.repository.modelo.Habitacion;


@Service
public class HabitacionServiceImpl implements IHabitacionService{

	@Autowired
	private IHabitacionRepo habitacionRepo;

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		habitacionRepo.insertar(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		habitacionRepo.actualizar(habitacion);
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return habitacionRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		habitacionRepo.eliminar(id);
	}


	
	

}
