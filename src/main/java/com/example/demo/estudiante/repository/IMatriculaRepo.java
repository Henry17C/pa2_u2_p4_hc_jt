package com.example.demo.estudiante.repository;

import java.util.List;

import com.example.demo.estudiante.repository.modelo.Matricula;
import com.example.demo.estudiante.repository.modelo.dto.EstudianteDTO;
import com.example.demo.estudiante.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaRepo {
	
	
	public void insertar(Matricula matricula);
	public void actualizar (Matricula matricula);
	public Matricula buscar(Integer  id);
	public void eliminar(Integer id);
	
	//public buscarTodosDTO(String nombre, String );
	
	
	public List<MatriculaDTO> seleccionarTodosDTO();
	
}
