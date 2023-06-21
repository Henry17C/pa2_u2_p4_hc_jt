package com.example.demo.estudiante.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.estudiante.repository.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		
		entityManager.persist(matricula);
		
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		entityManager.merge(matricula);
	}

	@Override
	public Matricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Matricula.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
