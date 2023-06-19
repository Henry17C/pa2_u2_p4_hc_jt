package com.example.demo.estudiante.repository;

import com.example.demo.estudiante.repository.modelo.Hotel;

public interface IHotelRepo {
	
	public void insertar (Hotel hotel);
	public void actualizar(Hotel hotel);
	public Hotel buscar(Integer id);
	public void eliminar(Integer id);

}
