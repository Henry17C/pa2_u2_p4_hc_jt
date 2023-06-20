package com.example.demo;





import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.estudiante.repository.IAutorRepo;
import com.example.demo.estudiante.repository.modelo.Autor;
import com.example.demo.estudiante.repository.modelo.Libro;
import com.example.demo.estudiante.service.IAutorService;
import com.example.demo.estudiante.service.IHabitacionService;
import com.example.demo.estudiante.service.IHotelService;
import com.example.demo.estudiante.service.ILibroService;



@SpringBootApplication
public class Pa2U2P4HcJtApplication implements CommandLineRunner{

	
	@Autowired
 private IAutorService autorService;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		
		Autor autor= new Autor();
		autor.setApellido("Coello");
		autor.setNombre("Paullo");
		
		
		Libro libro= new Libro();
		libro.setEditorial("Planeta");
		libro.setTitulo("El alquimista");
			
		
		Libro libro1= new Libro();
		libro1.setEditorial("Planeta");
		libro1.setTitulo("La vida");
		


         Set<Libro> libros= new HashSet<>();
         Set<Autor> autores= new HashSet<>();

         
         libros.add(libro);
         libros.add(libro1);
         autores.add(autor);

         autor.setLibros(libros);
        libro.setAutores(autores);
 		 libro1.setAutores(autores);

         autorService.insertar(autor);
 		 autor.setNombre("Paulo");
         autorService.actualizar(autor);
         autorService.buscar(4);
         autorService.eliminar(4);
         
         
         
         
         
         
         
         
         
         
         
		
		
	}

}
