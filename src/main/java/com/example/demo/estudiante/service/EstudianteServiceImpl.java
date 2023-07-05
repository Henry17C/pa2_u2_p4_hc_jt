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

	@Override
	public Estudiante seleccionarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarPorApellidoNamed(apellido);
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarPorApellidoNamedQuery(apellido);
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarPorApellidoNativeQuery(apellido);
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarPorApellidoNativeQueryNamed(apellido);
	}



	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarPorNombreNativeQueryNamed(nombre);
	}

	@Override
	public Estudiante seleccionarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarPorNombreNamed(nombre);
	}

	@Override
	public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso) {
		// TODO Auto-generated method stub
		return estudianteRepo.seleccionarEstudianteDinamico(nombre, apellido, peso);
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return estudianteRepo.borrarPorNombre(nombre);
	}

	@Override
	public int actualizar(String nombre, String apellido) {
		// TODO Auto-generated method stub
		return estudianteRepo.actualizar(nombre, apellido);
	}

}
