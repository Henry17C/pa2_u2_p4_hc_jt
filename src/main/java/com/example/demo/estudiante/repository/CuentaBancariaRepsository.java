package com.example.demo.estudiante.repository;

import com.example.demo.estudiante.repository.modelo.CuentaBancaria;

public interface CuentaBancariaRepsository {

	public void insertar(CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public CuentaBancaria buscar(Integer id);
	public void eliminar(Integer id);
}
