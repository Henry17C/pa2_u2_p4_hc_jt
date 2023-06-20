package com.example.demo.estudiante.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.estudiante.repository.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepoImpl implements ILibroRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		entityManager.persist(libro);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		entityManager.merge(libro);
	}

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Libro.class, id);
	}

	@Override
	public void elimnar(Integer id) {
		// TODO Auto-generated method stub
		entityManager.remove(this.buscar(id));
	}

}
