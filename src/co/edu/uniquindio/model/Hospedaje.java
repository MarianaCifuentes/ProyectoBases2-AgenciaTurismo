package co.edu.uniquindio.model;

public class Hospedaje {
	int id;
	int tipo_hospedaje;
	int ciudad_id;
	int cantidad_habitaciones;
	String nombre; //50
	
	public Hospedaje(int id, int tipo_hospedaje, int ciudad_id, int cantidad_habitaciones, String nombre) {
		super();
		this.id = id;
		this.tipo_hospedaje = tipo_hospedaje;
		this.ciudad_id = ciudad_id;
		this.cantidad_habitaciones = cantidad_habitaciones;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTipo_hospedaje() {
		return tipo_hospedaje;
	}
	public void setTipo_hospedaje(int tipo_hospedaje) {
		this.tipo_hospedaje = tipo_hospedaje;
	}
	public int getCiudad_id() {
		return ciudad_id;
	}
	public void setCiudad_id(int ciudad_id) {
		this.ciudad_id = ciudad_id;
	}
	public int getCantidad_habitaciones() {
		return cantidad_habitaciones;
	}
	public void setCantidad_habitaciones(int cantidad_habitaciones) {
		this.cantidad_habitaciones = cantidad_habitaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
