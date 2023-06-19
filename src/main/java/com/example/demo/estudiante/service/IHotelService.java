package com.example.demo.estudiante.service;

import com.example.demo.estudiante.repository.modelo.Hotel;

public interface IHotelService {
	
	public void insertar(Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	public void eliminar(Integer id);

}
