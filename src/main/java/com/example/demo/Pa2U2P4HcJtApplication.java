package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.estudiante.repository.modelo.Estudiante;
import com.example.demo.estudiante.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4HcJtApplication implements CommandLineRunner{

	
	@Autowired 
	private EstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante= new Estudiante();
		estudiante.setApellido("Coyago");
		estudiante.setEdad("2");
		estudiante.setNombre("Henry");
		
		estudianteService.registrar(estudiante);
		System.out.println(":)");
	}

}
