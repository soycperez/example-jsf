package com.devcperez.web;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Cesar Perez
 * Clase que permite controlar el funcionamiento con la pantalla login.xhtml
 */

@ManagedBean
public class LoginMBean {
	private String usuario; 
	private String contrase�a;
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getContrase�a() {
		return contrase�a;
	}
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public void ingresar() {
		System.out.println("Bienvenido " + usuario);
		
		if(usuario.equals("cperez") && contrase�a.equals("12345")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:inputUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La p�gina no existe", ""));
				e.printStackTrace();
			}
		}else {
			FacesContext.getCurrentInstance().addMessage("formLogin:inputUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contrase�a incorrecta", ""));
		}
	}
	
	private void redireccionar(String pagina) throws IOException{
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext(); 
		ec.redirect(pagina);
	}
}
