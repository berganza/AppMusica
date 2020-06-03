package com.berg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cancion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String titulo;
	
	@Column
	private String autor;
	
	@Column
	private double duracion;
	
	@Column
	private String imagen = "blues.png";
	
	@Column
	private int fechaEstreno;
	
	@Column
	private String estatus = "Activa";
	

	public Cancion() {
	}
	
	public Cancion(int id, String titulo, String autor, double duracion, String imagen, int fechaEstreno,
			String estatus) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
		this.imagen = imagen;
		this.fechaEstreno = fechaEstreno;
		this.estatus = estatus;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(int fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}




	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + ", imagen="
				+ imagen + ", fechaEstreno=" + fechaEstreno + ", estatus=" + estatus + "]";
	}

	
}