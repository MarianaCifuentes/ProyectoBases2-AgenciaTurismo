package co.edu.uniquindio.model;

public class TipoHospedaje {
	int id;
	String tipo; //50
	
	public TipoHospedaje(int id, String tipo) {
		super();
		this.id = id;
		this.tipo = tipo;
	}

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
}