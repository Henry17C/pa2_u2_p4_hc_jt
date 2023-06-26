package com.example.demo.estudiante.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.IAutoRepo;
import com.example.demo.estudiante.repository.modelo.Auto;

@Service
public class AutoServiceImpl implements IAutoService{
	
	@Autowired
	private IAutoRepo autoRepo;

	@Override
	public void insertar(Auto auto) {
		// TODO Auto-generated method stub
		autoRepo.insertar(auto);
	}

	@Override
	public Auto buscarAuto(String placa) {
		// TODO Auto-generated method stub
		return autoRepo.buscarAuto(placa);
	}

	@Override
	public List<Auto> buscarAutoLista(String color) {
		// TODO Auto-generated method stub
		return autoRepo.buscarAutoLista(color);
	}

	@Override
	public Auto buscarAutoTyped(String placa, BigDecimal precio) {
		// TODO Auto-generated method stub
		return autoRepo.buscarAutoTyped(placa, precio);
	}

	@Override
	public List<Auto> buscarAutoListaTyped(String placa, String color, BigDecimal precio) {
		// TODO Auto-generated method stub
		return autoRepo.buscarAutoListaTyped(placa, color, precio);
	}

}
