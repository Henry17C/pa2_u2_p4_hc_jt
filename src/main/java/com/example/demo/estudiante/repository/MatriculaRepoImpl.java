package com.example.demo.estudiante.repository;

import java.lang.reflect.Type;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.estudiante.repository.modelo.Matricula;
import com.example.demo.estudiante.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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

	@Override
	public List<MatriculaDTO> seleccionarTodosDTO() {
		// TODO Auto-generated method stub
		
		TypedQuery< MatriculaDTO> query= this.entityManager.createQuery("SELECT NEW com.example.demo.estudiante.repository.modelo.dto.MatriculaDTO(m.alumno.nombre, m.materia.nombre) FROM Matricula m", MatriculaDTO.class); 
		
		return query.getResultList();
	}

	
	
	
}
