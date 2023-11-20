package co.edu.uniquindio.model;

public class ServicioAutomovil {
	int id;
	int precio;
	String descripcion; //128
	int idReservaAutomovil;
	
	public ServicioAutomovil(int id, int precio, String descripcion, int idReservaAutomovil) {
		super();
		this.id = id;
		this.precio = precio;
		this.descripcion = descripcion;
		this.idReservaAutomovil = idReservaAutomovil;
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
	public int getIdReservaAutomovil() {
		return idReservaAutomovil;
	}
	public void setIdReservaAutomovil(int idReservaAutomovil) {
		this.idReservaAutomovil = idReservaAutomovil;
	}
}