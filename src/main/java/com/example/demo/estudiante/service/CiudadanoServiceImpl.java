package com.example.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.ICiudadanoRepo;
import com.example.demo.estudiante.repository.modelo.Ciudadano;


@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	@Autowired 
	private ICiudadanoRepo ciudadanoRepo;
	
	
	@Override
	public void insertar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		ciudadanoRepo.insertar(ciudadano);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		ciudadanoRepo.actualizar(ciudadano);
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return ciudadanoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		ciudadanoRepo.eliminar(id);
	}

}
