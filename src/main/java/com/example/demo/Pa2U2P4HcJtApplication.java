package com.example.demo;





import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.estudiante.repository.modelo.Autor;
import com.example.demo.estudiante.repository.modelo.Libro;
import com.example.demo.estudiante.service.IHabitacionService;
import com.example.demo.estudiante.service.IHotelService;
import com.example.demo.estudiante.service.ILibroService;



@SpringBootApplication
public class Pa2U2P4HcJtApplication implements CommandLineRunner{

	
	@Autowired
 private ILibroService iLibroService;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		
		Autor autor= new Autor();
		autor.setApellido("Aliheri");
		autor.setNombre("Homero");
		
		Autor autor2= new Autor();
		autor2.setApellido("Aliheri");
		autor2.setNombre("Dante");
		
		
		
		Libro libro= new Libro();
		libro.setEditorial("FantaSY");
		libro.setTitulo("La Iliada");
		
		
		
		
		


         Set<Autor> autores= new HashSet<>();
         autores.add(autor2);
         autores.add(autor);
         
 		libro.setAutores(autores);
 		iLibroService.insertar(libro);
 		iLibroService.actualizar(libro);
 		iLibroService.buscar(2);
 	
 		
 		//iLibroService.elimnar(1);
 		

	
		//iLibroService.insertar(libro);
		
		
	}

}
