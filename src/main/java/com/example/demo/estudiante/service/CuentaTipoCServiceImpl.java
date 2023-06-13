package com.example.demo.estudiante.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("corriente")

public class CuentaTipoCServiceImpl implements ICuentaTipoService {

	@Override
	public BigDecimal calculartipo(BigDecimal monto) {
		// TODO Auto-generated method stub
		return monto;
	}

}
