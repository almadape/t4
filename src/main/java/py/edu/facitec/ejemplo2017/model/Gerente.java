package py.edu.facitec.ejemplo2017.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Gerente {
@Id
@GeneratedValue
//CUANDO EL ID ES DE TIPO STRING NO SE OUEDE AUTO GENERAR
	private Integer id;
	private String ci;
	private String nombre;
	public int getId() {
		return id;
	}
	
	@OneToOne
	private Departamento departamento;
	
	public void setId(int id) {
		this.id = id;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
