package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.estudiante.repository.modelo.Ciudadano;
import com.example.demo.estudiante.repository.modelo.Empleado;
import com.example.demo.estudiante.service.ICiudadanoService;
import com.example.demo.estudiante.service.IEmpleadoService;



@SpringBootApplication
public class Pa2U2P4HcJtApplication implements CommandLineRunner{

	
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	
	@Autowired 
	private IEmpleadoService empleadoService;
	

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4HcJtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		
		
		System.out.println( "CIUDADANO");
		Ciudadano ciudadano= new Ciudadano();
		ciudadano.setApellido("Rodriguez");
		ciudadano.setCedula("123");
		//ciudadano.setEmpleado(null);
		ciudadano.setNombre("Axel");
		
		ciudadanoService.insertar(ciudadano);
		ciudadano.setApellido("Hernandez");
		ciudadanoService.actualizar(ciudadano);
		ciudadanoService.eliminar(1);
		System.out.println(ciudadanoService.buscar(2));
		
		
		
		System.out.println( "EMPLEADO");
		Empleado empleado= new Empleado();
		empleado.setCargo("Obrero");
		empleado.setCiudadano(ciudadanoService.buscar(5));
		empleado.setSueldo(new BigDecimal(540));
		
		
		empleadoService.insertar(empleado);
		empleado.setSueldo(new BigDecimal(430));
		empleadoService.actualizar(empleado);
		System.out.println(empleadoService.buscar(1));
		empleadoService.eliminar(2);
	
		
		
	}

}
