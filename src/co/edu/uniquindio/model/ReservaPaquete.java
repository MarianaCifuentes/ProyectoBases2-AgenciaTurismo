package co.edu.uniquindio.model;

public class ReservaPaquete {
	int id;
	int idCliente;
	int idPoliticaDescuento;
	int idAgencia;
	int paqueteTuristico;
	int cantidadPersonas;
	
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
	public int getIdPoliticaDescuento() {
		return idPoliticaDescuento;
	}
	public void setIdPoliticaDescuento(int idPoliticaDescuento) {
		this.idPoliticaDescuento = idPoliticaDescuento;
	}
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	public int getPaqueteTuristico() {
		return paqueteTuristico;
	}
	public void setPaqueteTuristico(int paqueteTuristico) {
		this.paqueteTuristico = paqueteTuristico;
	}
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}
	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}
	
	public ReservaPaquete(int id, int idCliente, int idPoliticaDescuento, int idAgencia, int paqueteTuristico,
			int cantidadPersonas) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idPoliticaDescuento = idPoliticaDescuento;
		this.idAgencia = idAgencia;
		this.paqueteTuristico = paqueteTuristico;
		this.cantidadPersonas = cantidadPersonas;
	}
}
