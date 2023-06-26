package com.example.demo.estudiante.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.estudiante.repository.modelo.Auto;

public interface IAutoService {
	
	public  void insertar(Auto auto);
	public Auto buscarAuto(String placa);
	public List<Auto> buscarAutoLista( String color);
	public Auto buscarAutoTyped(String placa, BigDecimal precio);
	public List<Auto> buscarAutoListaTyped(String placa, String color, BigDecimal precio);

}
