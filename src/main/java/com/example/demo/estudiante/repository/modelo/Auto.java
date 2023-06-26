package com.example.demo.estudiante.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "auto")
public class Auto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_auto")
	@SequenceGenerator(name = "seq_auto", sequenceName = "seq_auto", allocationSize = 1)
	@Column (name = "auto_id")
	private Integer id;
	
	@Column (name = "auto_placa")
	private String placa;
	
	@Column (name = "auto_marca")
	 private String marca;
	
	@Column (name = "auto_color")
	 private String color;
	
	@Column (name = "auto_precio")
	 private BigDecimal precio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", placa=" + placa + ", marca=" + marca + ", color=" + color + ", precio=" + precio
				+ "]";
	}
	
	

}
