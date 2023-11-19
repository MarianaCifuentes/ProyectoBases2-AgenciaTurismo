package co.edu.uniquindio.model;

public class Tipo {
	int id;
	String descripcion; //400
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Tipo(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}
}
