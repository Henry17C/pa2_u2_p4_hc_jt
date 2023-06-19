package com.example.demo.estudiante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.estudiante.repository.IHotelRepo;
import com.example.demo.estudiante.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepo hotelRepo;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		hotelRepo.insertar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		hotelRepo.actualizar(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return hotelRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		hotelRepo.eliminar(id);
	}
	
	

}
