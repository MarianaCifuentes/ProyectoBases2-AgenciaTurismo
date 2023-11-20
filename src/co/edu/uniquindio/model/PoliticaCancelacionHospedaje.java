package co.edu.uniquindio.model;

public class PoliticaCancelacionHospedaje {
	int id;
	int idHospedaje;
	int plazo;
	int costo_persona;
	
	public PoliticaCancelacionHospedaje(int id, int idHospedaje, int plazo, int costo_persona) {
		super();
		this.id = id;
		this.idHospedaje = idHospedaje;
		this.plazo = plazo;
		this.costo_persona = costo_persona;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdHospedaje() {
		return idHospedaje;
	}

	public void setIdHospedaje(int idHospedaje) {
		this.idHospedaje = idHospedaje;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public int getCosto_persona() {
		return costo_persona;
	}

	public void setCosto_persona(int costo_persona) {
		this.costo_persona = costo_persona;
	}
}
