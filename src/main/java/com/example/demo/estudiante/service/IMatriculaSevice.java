package com.example.demo.estudiante.service;

import java.util.List;

import com.example.demo.estudiante.repository.modelo.Matricula;
import com.example.demo.estudiante.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaSevice {

	
	public void insertar(Matricula matricula);
	public void actualizar (Matricula matricula);
	public Matricula buscar(Integer  id);
	public void eliminar(Integer id);
	
	public List<MatriculaDTO> seleccionarTodosDTO();
}
