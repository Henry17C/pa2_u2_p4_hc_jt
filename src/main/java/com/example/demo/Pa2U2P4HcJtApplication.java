package com.example.demo;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.estudiante.repository.IHotelRepo;
import com.example.demo.estudiante.repository.modelo.Ciudadano;
import com.example.demo.estudiante.repository.modelo.Habitacion;
import com.example.demo.estudiante.repository.modelo.Hotel;
import com.example.demo.estudiante.service.IHabitacionService;
import com.example.demo.estudiante.service.IHotelService;



@SpringBootApplication
public class Pa2U2P4HcJtApplication implements CommandLineRunner{

	
	@Autowired
	private IHotelService hotelService;
	
	@Autowired
	private IHabitacionService habitacionService;

	

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		
		Hotel hotel= new Hotel();
		hotel.setDireccion("Av E35");
		hotel.setNombre("Hotel Europa");
	

		List <Habitacion> habitaciones= new ArrayList<>();
		
		
		/*
		Habitacion habitacion= new Habitacion();
		habitacion.setHotel(this.hotelService.buscar(2));
		habitacion.setNumero("1");
		habitacion.setValor(new BigDecimal(50));
		habitacionService.insertar(habitacion);
		*/
		

		Habitacion habitacion1= new Habitacion();
		habitacion1.setHotel(hotel);
		habitacion1.setNumero("1");
		habitacion1.setValor(new BigDecimal(100));
		
		Habitacion habitacion2= new Habitacion();
		habitacion2.setHotel(hotel);
		habitacion2.setNumero("2");
		habitacion2.setValor(new BigDecimal(200));
		
		Habitacion habitacion3= new Habitacion();
		habitacion3.setHotel(hotel);
		habitacion3.setNumero("3");
		habitacion3.setValor(new BigDecimal(300));
		
		Habitacion habitacion4= new Habitacion();
		habitacion4.setHotel(hotel);
		habitacion4.setNumero("4");
		habitacion4.setValor(new BigDecimal(400));
		
		Habitacion habitacion5= new Habitacion();
		habitacion5.setHotel(hotel);
		habitacion5.setNumero("5");
		habitacion5.setValor(new BigDecimal(500));
		
		
		habitaciones.add(habitacion5);
		habitaciones.add(habitacion4);
		habitaciones.add(habitacion3);
		habitaciones.add(habitacion2);
		habitaciones.add(habitacion1);
		hotel.setHabitaciones(habitaciones);
		hotelService.insertar(hotel);
		hotelService.actualizar(hotel);
		habitacion1.setNumero("2");
		hotelService.buscar(14);
		hotelService.eliminar(14);
		
		
		habitacionService.actualizar(habitacionService.buscar(73));
		habitacionService.buscar(73);
		habitacionService.eliminar(73);
		
		
		
//		habitacionService.insertar(habitacion5);
//		habitacionService.insertar(habitacion4);
//		habitacionService.insertar(habitacion3);
//		habitacionService.insertar(habitacion2);
//		habitacionService.insertar(habitacion1);
		
		
		
		
		
		
		
		
		
	}

}
