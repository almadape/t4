package py.edu.facitec.ejemplo2017.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.ejemplo2017.model.Cliente;
import py.edu.facitec.ejemplo2017.model.Producto;

//INDICAMOS A SPRING QUE SE TRATA DE UN ACLASE
//QUE MANIPULARA DATOS

@Repository
public class ProductoDao {

	//GESTIONAR EL ESTADO Y PERSISTENCIA DE
	//LAS ENTIDADES
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(Producto producto){
		
		//GENERA EL SQL PARA INSERTAR EL OBJETO CLIENTE
		manager.persist(producto);
		
	}
	
}