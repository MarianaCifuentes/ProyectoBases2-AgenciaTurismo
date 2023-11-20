package co.edu.uniquindio.model;

public class PoliticaCancelacionPaquete {
	int id;
	int idPaqueteTuristico;
	int plazo;
	int costo_adicional;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPaqueteTuristico() {
		return idPaqueteTuristico;
	}
	public void setIdPaqueteTuristico(int idPaqueteTuristico) {
		this.idPaqueteTuristico = idPaqueteTuristico;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public int getCosto_adicional() {
		return costo_adicional;
	}
	public void setCosto_adicional(int costo_adicional) {
		this.costo_adicional = costo_adicional;
	}
	
	public PoliticaCancelacionPaquete(int id, int idPaqueteTuristico, int plazo, int costo_adicional) {
		super();
		this.id = id;
		this.idPaqueteTuristico = idPaqueteTuristico;
		this.plazo = plazo;
		this.costo_adicional = costo_adicional;
	}
}