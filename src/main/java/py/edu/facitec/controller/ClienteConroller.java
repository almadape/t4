package py.edu.facitec.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import py.edu.facitec.ejemplo2017.dao.ClienteDao;
import py.edu.facitec.ejemplo2017.model.Cliente;

@Transactional
@Controller
public class ClienteConroller {

	
	//CREA UNA INSTANCIA DEL OBJETO
	//PARA TODA LA APLICACION
	//INYECCION DE DEPENDENCIA
	@Autowired
	private ClienteDao dao;
	
	@RequestMapping("/cliente") //CONVIERTE LO RECIBIDO POR LA URL EN CLIENTE JAVA CLIENTE
	public String registrar(Cliente cliente){
		System.out.println("Registrando cliente "+cliente);
		dao.save(cliente);
		
		return "/view/cliente/ok";
		
	}
}
