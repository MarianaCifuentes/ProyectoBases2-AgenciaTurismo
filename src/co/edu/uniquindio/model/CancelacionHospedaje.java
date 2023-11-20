package co.edu.uniquindio.model;

public class CancelacionHospedaje {
	int id;
	int idReservaHospedaje;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdReservaHospedaje() {
		return idReservaHospedaje;
	}
	public void setIdReservaHospedaje(int idReservaHospedaje) {
		this.idReservaHospedaje = idReservaHospedaje;
	}
	
	public CancelacionHospedaje(int id, int idReservaHospedaje) {
		super();
		this.id = id;
		this.idReservaHospedaje = idReservaHospedaje;
	}	
}
