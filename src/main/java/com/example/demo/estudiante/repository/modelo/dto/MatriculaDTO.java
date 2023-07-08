package com.example.demo.estudiante.repository.modelo.dto;

public class MatriculaDTO {
	
	private String nombreAlumno;
	private String nombreMareria;
	
	
	public MatriculaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	MatriculaDTO(String nombreAlumno,  String nombreMareria){
		super();
		this.nombreAlumno= nombreAlumno;
		this.nombreMareria= nombreMareria;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getNombreMareria() {
		return nombreMareria;
	}

	public void setNombreMareria(String nombreMareria) {
		this.nombreMareria = nombreMareria;
	}

	@Override
	public String toString() {
		return "MatriculaDTO [nombreAlumno=" + nombreAlumno + ", nombreMareria=" + nombreMareria + "]";
	}
	
	
	
	

}
