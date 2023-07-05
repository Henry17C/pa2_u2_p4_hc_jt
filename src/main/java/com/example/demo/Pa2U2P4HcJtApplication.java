package com.example.demo;





import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.estudiante.repository.IAutorRepo;
import com.example.demo.estudiante.repository.modelo.Alumno;
import com.example.demo.estudiante.repository.modelo.Autor;
import com.example.demo.estudiante.repository.modelo.Estudiante;
import com.example.demo.estudiante.repository.modelo.Libro;
import com.example.demo.estudiante.repository.modelo.Materia;
import com.example.demo.estudiante.repository.modelo.Matricula;
import com.example.demo.estudiante.service.IAutorService;
import com.example.demo.estudiante.service.IEstudianteService;
import com.example.demo.estudiante.service.IHabitacionService;
import com.example.demo.estudiante.service.IHotelService;
import com.example.demo.estudiante.service.ILibroService;
import com.example.demo.estudiante.service.IMatriculaSevice;



@SpringBootApplication
public class Pa2U2P4HcJtApplication implements CommandLineRunner{

	
	@Autowired
 private IEstudianteService estudianteService;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
//		System.out.println(estudianteService.seleccionarPorApellidoNamed("Coyago"));
//		System.out.println(estudianteService.seleccionarPorApellidoNamedQuery("Coyago"));
//		System.out.println(estudianteService.seleccionarPorApellidoNativeQuery("Coyago"));
//
//		System.out.println(estudianteService.seleccionarPorApellidoNativeQueryNamed("Coyago"));
//		System.out.println(estudianteService.seleccionarPorNombreNamed("Mark"));
//		System.out.println(estudianteService.seleccionarPorNombreNativeQueryNamed("Mark"));
//		
		
		
		
		
		Estudiante estudiante= new Estudiante();
		estudiante.setApellido("Freire");
		estudiante.setCedula("123");
		estudiante.setEdad("15");
		estudiante.setNombre("Pablo");
		estudiante.setPeso(20.0);
		//estudianteService.insertar(estudiante);
		
		Estudiante estudiante1= new Estudiante();
		estudiante1.setApellido("Fred");
		estudiante1.setCedula("123");
		estudiante1.setEdad("15");
		estudiante1.setNombre("Pablo");
		estudiante1.setPeso(103.0);
		//estudianteService.insertar(estudiante1);
		
		
		//System.out.println(estudianteService.seleccionarEstudianteDinamico("Pabl", "Fred", 103.0));
		//System.out.println(estudianteService.seleccionarEstudianteDinamico("Pablo", "Freire", 20.0));
	
		System.out.println(estudianteService.actualizar("Mario", "Fred"));
		System.out.println(estudianteService.eliminarPorNombre("Mario"));
		
		
		
		
	}

}
