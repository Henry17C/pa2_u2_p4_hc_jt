package com.example.demo.estudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.IMatriculaRepo;
import com.example.demo.estudiante.repository.modelo.Matricula;
import com.example.demo.estudiante.repository.modelo.dto.MatriculaDTO;

@Service
public class MatriculaServiceImpl implements IMatriculaSevice {

	
	@Autowired
	private IMatriculaRepo iMatriculaRepo;
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		iMatriculaRepo.insertar(matricula);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		iMatriculaRepo.actualizar(matricula);
	}

	@Override
	public Matricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return iMatriculaRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		iMatriculaRepo.eliminar(id);
	}

	@Override
	public List<MatriculaDTO> seleccionarTodosDTO() {
		// TODO Auto-generated method stub
		return iMatriculaRepo.seleccionarTodosDTO();
	}

}
