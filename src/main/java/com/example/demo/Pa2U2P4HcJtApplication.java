package com.example.demo;





import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.estudiante.repository.IAutorRepo;
import com.example.demo.estudiante.repository.modelo.Alumno;
import com.example.demo.estudiante.repository.modelo.Autor;
import com.example.demo.estudiante.repository.modelo.Libro;
import com.example.demo.estudiante.repository.modelo.Materia;
import com.example.demo.estudiante.repository.modelo.Matricula;
import com.example.demo.estudiante.service.IAutorService;
import com.example.demo.estudiante.service.IHabitacionService;
import com.example.demo.estudiante.service.IHotelService;
import com.example.demo.estudiante.service.ILibroService;
import com.example.demo.estudiante.service.IMatriculaReviceI;



@SpringBootApplication
public class Pa2U2P4HcJtApplication implements CommandLineRunner{

	
	@Autowired
 private IMatriculaReviceI iMatriculaReviceI;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
	
		List<Matricula> matriculas =new ArrayList<>();
		
		
		Materia materia = new Materia();
		materia.setNombre("Programacion");
		materia.setMatriculas(matriculas);
	
		
		Alumno alumno= new Alumno();
		alumno.setNombre("Calculo");
		alumno.setMatriculas(matriculas);
         
         
	Matricula matricula= new Matricula();
		
		matricula.setFecha(LocalDateTime.now());
		matriculas.add(matricula);
		matricula.setNumero("1");
		matricula.setAlumno(alumno);
		matricula.setMateria(materia);
		
		iMatriculaReviceI.insertar(matricula);
         
         
         
         
         
         
         
		
		
	}

}
