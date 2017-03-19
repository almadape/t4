package py.edu.facitec.ejemplo2017.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.ejemplo2017.model.Cliente;

//INDICAMOS A SPRING QUE SE TRATA DE UN ACLASE
//QUE MANIPULARA DATOS

@Repository
public class ClienteDao {

	//GESTIONAR EL ESTADO Y PERSISTENCIA DE
	//LAS ENTIDADES
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Cliente cliente){
		
		//GENERA EL SQL PARA INSERTAR EL OBJETO CLIENTE
		manager.persist(cliente);
		
	}
	
}
