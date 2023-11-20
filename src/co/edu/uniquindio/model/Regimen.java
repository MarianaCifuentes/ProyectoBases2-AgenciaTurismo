package co.edu.uniquindio.model;

public class Regimen {
	int id;
	int precio;
	String descripcion; //128
	int idHospedaje;
	
	
	public int getIdHospedaje() {
		return idHospedaje;
	}
	public void setIdHospedaje(int idHospedaje) {
		this.idHospedaje = idHospedaje;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Regimen(int id, int precio, String descripcion, int idHospedaje) {
		super();
		this.id = id;
		this.precio = precio;
		this.descripcion = descripcion;
		this.idHospedaje = idHospedaje;
	}
}