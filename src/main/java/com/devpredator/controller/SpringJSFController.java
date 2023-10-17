package com.devpredator.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;



import com.devpredator.model.service.SpringService;

/**
 * @author axel
 * controlador de ejemplo para integrar spring con jsf
 */
@ManagedBean
@ViewScoped																				//define que el alcance del controlador es a nivel de la pant
public class SpringJSFController {
	
	
	@PostConstruct                                                                      //al cargar una pagina de jsf, se ejecuta este metodo
	public void init() {
		String nombre = this.springService.mostrarNombreEmpresa();
		System.out.println(nombre);
		this.nombreEmpresa = nombre;
		
		String nombreEmpleado = this.springService.mostrarNombreEmpleado();
		System.out.println(nombreEmpleado);
		this.nombreEmpleado = nombreEmpleado;
		
	}
	
	
	public SpringService getSpringService() {
		return springService;
	}
	public void setSpringService(SpringService springService) {
		this.springService = springService;
	}
	
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}



	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}




	@ManagedProperty("#{springServiceImpl}")
	private SpringService springService; 
	
	private String nombreEmpresa;
	private String nombreEmpleado;
}
