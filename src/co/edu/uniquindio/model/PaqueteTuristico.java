package co.edu.uniquindio.model;

public class PaqueteTuristico {
	int id;
	int precio;
	String nombre; //50
	
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public PaqueteTuristico(int id, int precio, String nombre) {
		super();
		this.id = id;
		this.precio = precio;
		this.nombre = nombre;
	}
}