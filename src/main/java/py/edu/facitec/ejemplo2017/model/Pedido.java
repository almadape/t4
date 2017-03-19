package py.edu.facitec.ejemplo2017.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Pedido {
	@Id
	@GeneratedValue
	private long id;
	private Date fechaToma;
	private Date fechaEntrega;
	private double total;
	public long getId() {
		return id;
	}
	
	//APLICACION DE ASOCIACION BIDIRECCIONAL DE MUCHOS A UNO 
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToMany(mappedBy="pedido")
	private List<ItemPedido>itemPedidos;
	
	
	
	public void setId(long id) {
		this.id = id;
	}
	public Date getFechaToma() {
		return fechaToma;
	}
	public void setFechaToma(Date fechaToma) {
		this.fechaToma = fechaToma;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fechaToma=" + fechaToma + ", fechaEntrega=" + fechaEntrega + ", total=" + total
				+ "]";
	}
	
	
}
