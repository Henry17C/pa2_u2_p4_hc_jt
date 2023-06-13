package com.example.demo.estudiante.service;

import java.math.BigDecimal;

import com.example.demo.estudiante.repository.modelo.CuentaBancaria;

public interface CuentaBancariaService {

	public void aperturar(CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public CuentaBancaria consultar(Integer id);
	public void eliminar(Integer id);
	
	public void depositar(Integer id, BigDecimal monto );
}
