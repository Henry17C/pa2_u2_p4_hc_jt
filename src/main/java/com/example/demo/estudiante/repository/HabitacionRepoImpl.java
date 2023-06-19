package com.example.demo.estudiante.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.estudiante.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepoImpl implements IHabitacionRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		entityManager.persist(habitacion);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		// TODO Auto-generated method stub
		entityManager.merge(habitacion);
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Habitacion.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
		
	}

}
