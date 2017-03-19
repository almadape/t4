package py.edu.facitec.ejemplo2017.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departamento {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String descripcion;
	
	//APLICACION DE ASOCIACIOIN BIDIRECCIONAL
	           //NOMBRE DEL OBJETO DEPAAARTAMENTO EN LA CLASE GERENTE
	@OneToOne(mappedBy="departamento")     //RELACION DE UNO A UNO
	private Gerente gerente;
	
	
	@OneToMany(mappedBy="departamento")
	private List<Usuario>usuarios;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
