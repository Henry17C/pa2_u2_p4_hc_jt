package com.example.demo.estudiante.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.estudiante.repository.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepoImpl implements IAutorRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		entityManager.persist(autor);	
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		entityManager.merge(autor);
	}

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Autor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		entityManager.remove(this.buscar(id));
	}

}
