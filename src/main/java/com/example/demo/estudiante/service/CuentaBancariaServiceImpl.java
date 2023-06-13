package com.example.demo.estudiante.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.CuentaBancariaRepsository;
import com.example.demo.estudiante.repository.modelo.CuentaBancaria;
@Service

public class CuentaBancariaServiceImpl implements CuentaBancariaService{

	@Autowired
	private CuentaBancariaRepsository cuentaBancariaRepsository;
	@Override
	public void aperturar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepsository.insertar(cuentaBancaria);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
	    
		this.cuentaBancariaRepsository.actualizar(cuentaBancaria);
	}

	@Override
	public CuentaBancaria consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepsository.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepsository.eliminar(id);
	}

	@Override
	public void depositar(Integer id, BigDecimal monto) {
		// TODO Auto-generated method stub
		BigDecimal montoRegalo;
		
		CuentaBancaria cuentaBancaria = this.consultar(id);
		BigDecimal saldoCuenta = cuentaBancaria.getSaldo();
		Integer fechaHoy=LocalDateTime.now().getDayOfMonth();
		
		if(fechaHoy % 2 == 0) {
			BigDecimal porcentaje = monto.multiply(new BigDecimal(0.05));
			montoRegalo = porcentaje.add(monto);
			
			cuentaBancaria.setSaldo(saldoCuenta.add(montoRegalo));
		}
		
		else {
		cuentaBancaria.setSaldo(saldoCuenta.add(monto));
		}
	}
	
	

}