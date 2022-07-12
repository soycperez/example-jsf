package com.devcperez.web;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devcperez.entity.Empleado;
import com.devcperez.services.EmpleadoService;

/**
 * @author Cesar Perez
 * Clase controller que se encargara de procesar la información para la pantalla principal.xhtml
 */

@ManagedBean

//Ayuda a mantener la información hasta el momento que pasemos a otra pantalla
@ViewScoped
public class PrincipalMBean {
	private List<Empleado> empleados; 
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Metodo que se encarga de inicializar la 
	 * información de la pantalla principal. 
	 */
	@PostConstruct  
	public void init() {
		this.consultarEmpleados();
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados(); 
	}
	

}
