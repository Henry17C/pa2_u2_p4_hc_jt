package com.example.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.IAutorRepo;
import com.example.demo.estudiante.repository.modelo.Autor;

@Service
public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepo autorRepo;
	
	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		autorRepo.insertar(autor);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		autorRepo.actualizar(autor);
	}

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return autorRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		autorRepo.eliminar(id);
	}

}
