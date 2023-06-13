package com.example.demo.estudiante.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("ahorros")
public class CuentaTipoAServiceImpl implements ICuentaTipoService {

	@Override
	public BigDecimal calculartipo(BigDecimal monto) {
		// TODO Auto-generated method stub
		BigDecimal nuevoMonto= monto.add(new BigDecimal(10));
		
		return nuevoMonto;
	}

}
