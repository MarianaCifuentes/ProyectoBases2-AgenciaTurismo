package co.edu.uniquindio.model;

public class DescuentoPaquete {
	int id;
	int personasRequeridas;
	int porcentajeDescuento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersonasRequeridas() {
		return personasRequeridas;
	}
	public void setPersonasRequeridas(int personasRequeridas) {
		this.personasRequeridas = personasRequeridas;
	}
	public int getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	public void setPorcentajeDescuento(int porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	public DescuentoPaquete(int id, int personasRequeridas, int porcentajeDescuento) {
		super();
		this.id = id;
		this.personasRequeridas = personasRequeridas;
		this.porcentajeDescuento = porcentajeDescuento;
	}
}
