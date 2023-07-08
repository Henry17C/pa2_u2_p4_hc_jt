package com.example.demo.estudiante.repository.modelo.dto;

public class EstudianteDTO {
	
	
	private String nombre;
	private String apellido;
	
	public EstudianteDTO() {}
	
	public EstudianteDTO(String nombre,String apellido) {
		super();
		this.apellido= apellido;
		this.nombre= nombre;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "EstudianteDTO [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
	
	
	
	
	
	
}
