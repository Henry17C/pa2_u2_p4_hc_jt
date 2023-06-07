package com.example.demo.estudiante.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.estudiante.repository.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements EstudianteRepo {

	List<Estudiante> base= new ArrayList<>();
	
	@Override
	public void insertar(Estudiante estu) {
		// TODO Auto-generated method stub
		base.add(estu);
	}

}
