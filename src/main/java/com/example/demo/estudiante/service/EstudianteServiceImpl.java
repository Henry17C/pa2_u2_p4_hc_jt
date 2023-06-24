package com.example.demo.estudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.IEstudianteRepo;
import com.example.demo.estudiante.repository.modelo.Estudiante;

@Service
public class EstudianteServiceImpl  implements IEstudianteService{

	@Autowired
	private IEstudianteRepo estudianteRepo;
	
	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarPorApellido(apellido);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudianteRepo.insertar(estudiante);
	}

	@Override
	public List<Estudiante> reporteEstudiantes(String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarListaPorApellido(apellido);
	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarPorApellidoyNombre(apellido, nombre);
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarPorApellidoTyped(apellido);
	}

}
