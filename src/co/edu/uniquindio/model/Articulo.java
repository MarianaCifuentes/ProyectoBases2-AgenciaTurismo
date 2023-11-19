package co.edu.uniquindio.model;

public class Articulo {
	int id;
	int idAgencia;
	int tipo_id;
	int precio;
	String nombre;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}public int getIdAgencia() {
		return idAgencia;
	}
	public void setidAgencia(int idAgencia) {
		this.id = idAgencia;
	}
	public int getTipo_id() {
		return tipo_id;
	}
	public void setTipo_id(int tipo_id) {
		this.tipo_id = tipo_id;
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
	
	
	public Articulo(int id, int idAgencia, int tipo_id, int precio, String nombre) {
		super();
		this.id = id;
		this.idAgencia = idAgencia;
		this.tipo_id = tipo_id;
		this.precio = precio;
		this.nombre = nombre;
	}
}
