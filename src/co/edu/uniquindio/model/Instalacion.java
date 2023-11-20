package co.edu.uniquindio.model;

public class Instalacion {
	int id;
	String nombre;
	String descripcion;
	int hospedaje_id;
	
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getHospedaje_id() {
		return hospedaje_id;
	}
	public void setHospedaje_id(int hospedaje_id) {
		this.hospedaje_id = hospedaje_id;
	}
	
	public Instalacion(int id, String nombre, String descripcion, int hospedaje_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.hospedaje_id = hospedaje_id;
	}
}
