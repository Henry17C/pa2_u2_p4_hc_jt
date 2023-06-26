package com.example.demo;





import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.estudiante.repository.IAutorRepo;
import com.example.demo.estudiante.repository.modelo.Auto;
import com.example.demo.estudiante.repository.modelo.Autor;
import com.example.demo.estudiante.repository.modelo.Libro;
import com.example.demo.estudiante.service.IAutoService;
import com.example.demo.estudiante.service.IAutorService;
import com.example.demo.estudiante.service.IHabitacionService;
import com.example.demo.estudiante.service.IHotelService;
import com.example.demo.estudiante.service.ILibroService;



@SpringBootApplication
public class Pa2U2P4HcJtApplication implements CommandLineRunner{

	
	@Autowired
 private IAutoService autoService;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Auto auto= new Auto();
		auto.setColor("azul");
		auto.setMarca("Mazda");
		auto.setPlaca("RAC123");
		auto.setPrecio(new BigDecimal(6000));
	
		//autoService.insertar(auto);
		
		System.out.println(autoService.buscarAuto("HC123"));
		System.out.println(autoService.buscarAutoTyped("RAC123", new BigDecimal(6000)));
		System.out.println(autoService.buscarAutoLista("rojo").get(0));
		System.out.println(autoService.buscarAutoListaTyped("ABC123", "rojo", new BigDecimal(3000)).get(0));
         
		
		
		;
         
         
         
         
         
         
         
		
		
	}

}
