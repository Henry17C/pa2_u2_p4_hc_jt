package com.example.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.ILibroRepo;
import com.example.demo.estudiante.repository.modelo.Libro;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	private ILibroRepo iLibroRepo;
	
	
	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		iLibroRepo.insertar(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		iLibroRepo.actualizar(libro);
	}

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return iLibroRepo.buscar(id);
	}

	@Override
	public void elimnar(Integer id) {
		// TODO Auto-generated method stub
		iLibroRepo.elimnar(id);
	}




}
