package co.edu.uniquindio.model;

import java.util.Date;

public class Habitacion {
	int id;
	int hospedaje_id;
	int nivel_id;
	Date fecha;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHospedaje_id() {
		return hospedaje_id;
	}
	public void setHospedaje_id(int hospedaje_id) {
		this.hospedaje_id = hospedaje_id;
	}
	public int getNivel_id() {
		return nivel_id;
	}
	public void setNivel_id(int nivel_id) {
		this.nivel_id = nivel_id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public Habitacion(int id, int hospedaje_id, int nivel_id, Date fecha) {
		super();
		this.id = id;
		this.hospedaje_id = hospedaje_id;
		this.nivel_id = nivel_id;
		this.fecha = fecha;
	}
}
