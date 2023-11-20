package co.edu.uniquindio.model;

public class NivelHabitacion {
	int id;
	String tipo; //50
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public NivelHabitacion(int id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}
}
