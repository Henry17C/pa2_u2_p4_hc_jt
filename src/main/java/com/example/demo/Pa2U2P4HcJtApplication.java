package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.estudiante.repository.modelo.CuentaBancaria;
import com.example.demo.estudiante.repository.modelo.Estudiante;
import com.example.demo.estudiante.service.CuentaBancariaService;
import com.example.demo.estudiante.service.EstudianteService;

@SpringBootApplication
public class Pa2U2P4HcJtApplication implements CommandLineRunner{

	
	@Autowired 
	private EstudianteService estudianteService;
	
	@Autowired
	private CuentaBancariaService cuentaBancariaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	/*	
		//Creacion de estudiante
		Estudiante estudiante= new Estudiante();
		estudiante.setCedula("1234");
		estudiante.setApellido("Toscano");
		estudiante.setEdad("2");
		estudiante.setNombre("Juan");
		
		
		//Insertar estudiante
		estudianteService.insertar(estudiante);
		
		/*
		//Actualizar estudiante
		estudiante.setNombre("Israel");
		estudianteService.actualizar(estudiante);
		
		
		//Borrar estudiante
		//estudianteService.eliminar("123");
	
		
		System.out.println(estudianteService.buscar("1234"));
		System.out.println(":)");
		
	*/
		
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		/*
		cuentaBancaria.setCedulaPropietario("1234567850");
		cuentaBancaria.setNumero("12346");
		cuentaBancaria.setFechaApertura(LocalDateTime.now());
		cuentaBancaria.setSaldo(new BigDecimal(100));
		cuentaBancaria.setTipo("A");
		
	
		
		this.cuentaBancariaService.aperturar(cuentaBancaria);
		*/
	
		
	
		System.out.println("cuenta antes del deposito: "+this.cuentaBancariaService.consultar(9));
		this.cuentaBancariaService.depositar(9, new BigDecimal(100));
		System.out.println("cuenta despues del deposito: "+ this.cuentaBancariaService.consultar(9));
		
		//this.cuentaBancariaService.actualizar(cuentaBancaria);
		
	}

}
