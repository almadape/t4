package py.edu.facitec.ejemplo2017.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//PAQUETE javax.persistence
//SE TRATA DE UNA TABLE CLIENTE
@Entity
public class Cliente {

	//INDICAMOS QUE SE TRATA DE UNA CLASE PRIMARIA
	@Id      
	//PARA GENERACION AUTOMATICA DE ID
	@GeneratedValue    
	private int id;
	private String nombre;
	private String correo;
	
	//MAPPENDB SE USA DONDE HAY ONETOMANY
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> Pedidos;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", correo=" + correo + "]";
	}
	
	
	
	
}
