package com.devcperez.entity;

public class Empleado {
	
	private String nombre; 
	private String primerApellido; 
	private String segundoApelido; 
	private String puesto; 
	private boolean estatus;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre, String primerApellido, String segundoApelido, String puesto, boolean estatus) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApelido = segundoApelido;
		this.puesto = puesto;
		this.estatus = estatus;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApelido() {
		return segundoApelido;
	}
	public void setSegundoApelido(String segundoApelido) {
		this.segundoApelido = segundoApelido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	} 
	
	
}
