package com.example.demo.estudiante.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.estudiante.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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

	@Override
	public Estudiante seleccionarPorApellidoNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query=this.entityManager.createNamedQuery("Estudiante.buscaPorApellido", Estudiante.class);
		query.setParameter("apellido", apellido);
		return query.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		Query query=this.entityManager.createNamedQuery("Estudiante.buscaPorApellido");
		query.setParameter("apellido", apellido);
		return (Estudiante) query.getSingleResult();

	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQuery(String apellido) {
		// TODO Auto-generated method stub
		
		Query query= this.entityManager.createNativeQuery("SELECT * FROM estudiante WHERE estu_apellido= :apellido", Estudiante.class);
		query.setParameter("apellido", apellido);
		return (Estudiante) query.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query= this.entityManager.createNamedQuery("Estudiante.buscaPorApellidoNative", Estudiante.class);
		query.setParameter("apellido", apellido);
		return query.getSingleResult();
	}



	@Override
	public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query= this.entityManager.createNamedQuery("Estudiante.buscaPorNombreNative", Estudiante.class);
		query.setParameter("nombre", nombre);
		return query.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> query=this.entityManager.createNamedQuery("Estudiante.buscaPorNombre", Estudiante.class);
		query.setParameter("nombre", nombre);
		return query.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoCriteriaAPIQuery(String apellido) {
		// TODO Auto-generated method stub
		
		CriteriaBuilder mybuilder= this.entityManager.getCriteriaBuilder();
		//1. especificamos el tipo de retorno de mi query, esto es un silit a la primeria linea de la delcaracion de un typedquery
		CriteriaQuery< Estudiante> myCriteriaQuery= mybuilder.createQuery(Estudiante.class);
		//2. empleamos a crear el query
		//2.1 definimos el FROM(root)
		Root<Estudiante> mitablaFrom= myCriteriaQuery.from(Estudiante.class);//FROM estudiante
		//3. Construir las condiciones de mi SQL, las condiciones se las conoce como predicados,
		//cada condicion es un predicado 
		Predicate condicionApellido = mybuilder.equal(mitablaFrom.get("apellido"), apellido);
		
		//4. vamos a armar el sql final 
		myCriteriaQuery.select(mitablaFrom).where(condicionApellido);
		//puedo pasarle u obj criteria query
		
		//5. la ejecucion de query la realizamos con typedQuery
		TypedQuery<Estudiante> queryFinal= this.entityManager.createQuery(myCriteriaQuery);
		
		
		
		return queryFinal.getSingleResult();
	}
	
	
	
	

}
