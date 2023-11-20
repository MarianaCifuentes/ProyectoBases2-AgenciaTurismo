package co.edu.uniquindio.model;

import java.util.Date;

public class ReservaHospedaje {
	int id;
	int idCliente;
	int idRegimenHospedaje;
	int idAgenciaHospedaje;
	Date fechaInicio;
	Date fechaFin;
	int costo_total;
	int idHabitacion;
	int cantidadHabitaciones;
	int cantidadPersonas;
//	int politicaCancelacion y cancelacion;
	public ReservaHospedaje(int id, int idCliente, int idRegimenHospedaje, int idAgenciaHospedaje, Date fechaInicio,
			Date fechaFin, int costo_total, int idHabitacion, int cantidadHabitaciones, int cantidadPersonas) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idRegimenHospedaje = idRegimenHospedaje;
		this.idAgenciaHospedaje = idAgenciaHospedaje;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costo_total = costo_total;
		this.idHabitacion = idHabitacion;
		this.cantidadHabitaciones = cantidadHabitaciones;
		this.cantidadPersonas = cantidadPersonas;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdRegimenHospedaje() {
		return idRegimenHospedaje;
	}
	public void setIdRegimenHospedaje(int idRegimenHospedaje) {
		this.idRegimenHospedaje = idRegimenHospedaje;
	}
	public int getIdAgenciaHospedaje() {
		return idAgenciaHospedaje;
	}
	public void setIdAgenciaHospedaje(int idAgenciaHospedaje) {
		this.idAgenciaHospedaje = idAgenciaHospedaje;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public int getCosto_total() {
		return costo_total;
	}
	public void setCosto_total(int costo_total) {
		this.costo_total = costo_total;
	}
	public int getIdHabitacion() {
		return idHabitacion;
	}
	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}
	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}
	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}
}