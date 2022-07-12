package com.devcperez.services;

import java.util.ArrayList;
import java.util.List;

import com.devcperez.entity.Empleado;

public class EmpleadoService {
	
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado("Diego", "Paniagua", "López", "Senior Developer Java", true);
		Empleado empleadoMicrosoft = new Empleado("Luis Jesús", "Loópez", "Romero", "CEO", true);
		Empleado empleadoApple = new Empleado("Daniel", "López", "Romero", "Architect", true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
	}
	
}
