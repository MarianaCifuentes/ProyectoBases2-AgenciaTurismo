package co.edu.uniquindio.model;

public class FacturaArticulo {
	int id;
	int pago;
	int articuloId;
	int cantidad;
	int precioUnitario;
	
	public FacturaArticulo(int id, int pago, int articuloId, int cantidad, int precioUnitario) {
		super();
		this.id = id;
		this.pago = pago;
		this.articuloId = articuloId;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPago() {
		return pago;
	}
	public void setPago(int pago) {
		this.pago = pago;
	}
	public int getArticuloId() {
		return articuloId;
	}
	public void setArticuloId(int articuloId) {
		this.articuloId = articuloId;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
	
}
