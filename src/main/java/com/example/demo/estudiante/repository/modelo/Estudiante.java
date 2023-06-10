package com.example.demo.estudiante.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "estudiante", schema = "public")
@Entity
public class Estudiante {
	
	
	@Column(name = "estu_nombre")
	private String nombre;
	
	@Column(name = "estu_apellido")
	private String apellido;
	
	@Column(name = "estu_edad")
	private String edad;
	
	@Id
	@Column(name = "estu_cedula")
	private String cedula;
	
	
	//get y set
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", cedula=" + cedula
				+ "]";
	}
	

}
