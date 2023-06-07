package com.example.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.EstudianteRepo;
import com.example.demo.estudiante.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteRepo estudianteRepo;
	
	@Override
	public void registrar(Estudiante estu) {
		// TODO Auto-generated method stub
		estudianteRepo.insertar(estu);
	}

}
