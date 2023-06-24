package com.example.demo.estudiante.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.estudiante.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

	
	@PersistenceContext 
	private EntityManager entityManager;
	
	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		
		
		Query query= this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido= :apellido");
		query.setParameter("apellido", apellido);
		return (Estudiante) query.getSingleResult();
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		entityManager.persist(estudiante);
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		Query query= this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido= :apellido");
		query.setParameter("apellido", apellido);
		return query.getResultList();
	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		// TODO Auto-generated method stub

		Query query= this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido= :apellido AND e.nombre= : nombre");
		query.setParameter("apellido", apellido);
		query.setParameter("nombre", nombre);
		return (Estudiante) query.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		// TODO Auto-generated method stub
		
		TypedQuery<Estudiante> query= this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido= :apellido", Estudiante.class);
		query.setParameter("apellido", apellido);
		return query.getSingleResult();
	}
	
	
	
	

}
