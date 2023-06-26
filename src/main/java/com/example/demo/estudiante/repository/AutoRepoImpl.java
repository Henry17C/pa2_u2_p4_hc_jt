package com.example.demo.estudiante.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.estudiante.repository.modelo.Auto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutoRepoImpl implements IAutoRepo{

	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Auto auto) {
		// TODO Auto-generated method stub
		entityManager.persist(auto);
	}

	@Override
	public Auto buscarAuto(String placa) {
		// TODO Auto-generated method stub
		Query query= this.entityManager.createQuery("SELECT a FROM Auto a WHERE (a.placa = :placa OR a.color LIKE 'b%') ");
		query.setParameter("placa", placa);
		return (Auto) query.getSingleResult();
	}

	@Override
	public List<Auto> buscarAutoLista(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Auto> query= this.entityManager.createQuery("SELECT a FROM Auto a WHERE a.placa LIKE '%123' OR a.color= :color OR a.precio = 2000", Auto.class);
		query.setParameter("color", color);
		
		return query.getResultList();
	}

	@Override
	public Auto buscarAutoTyped(String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		TypedQuery<Auto> query= this.entityManager.createQuery("SELECT a FROM Auto a WHERE a.placa = :placa AND a.color LIKE 'azul' AND a.precio >= :precio", Auto.class);
		query.setParameter("placa", placa);
		query.setParameter("precio", precio);
		return query.getSingleResult();
	}

	@Override
	public List<Auto> buscarAutoListaTyped(String placa, String color, BigDecimal precio) {
		// TODO Auto-generated method stub
		TypedQuery<Auto> query= this.entityManager.createQuery("SELECT a FROM Auto a WHERE a.placa= :placa OR a.color= :color OR a.precio= :precio", Auto.class);
		query.setParameter("color", color);
		query.setParameter("precio", precio);
		query.setParameter("placa", placa);
		
		return query.getResultList();
	}

}
