package com.devpredator.model.service;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import com.devpredator.model.dao.EmpleadoDao;@Service
public class SpringServiceImpl implements SpringService {	@Override	public String mostrarNombreEmpresa() {		// TODO Auto-generated method stub		return "Anotaciones con Spring y jsf";	}	@Override	public String mostrarNombreEmpleado() {		// TODO Auto-generated method stub		return empleadoDao.consultarNombreEmpleado();	}			@Autowired	private EmpleadoDao empleadoDao;

}