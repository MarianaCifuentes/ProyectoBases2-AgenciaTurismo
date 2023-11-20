package co.edu.uniquindio.model;

import java.time.LocalDate;

public class ReservaAutomovil {

    private Integer id;
    private int idCliente;
    private int agencia_automovil_id;
    private LocalDate fecha_reserva;
    private LocalDate fecha_entrega;
    private int valor_renta;
    private int valor_adicional;

    public ReservaAutomovil() {
        super();
    }

    public ReservaAutomovil(int id, int idCliente, int agencia_automovil_id, LocalDate fecha_reserva, LocalDate fecha_entrega,
            int valor_renta, int valor_adicional) {
        this.id = id;
        this.idCliente = idCliente;
        this.agencia_automovil_id = agencia_automovil_id;
        this.fecha_reserva = fecha_reserva;
        this.fecha_entrega = fecha_entrega;
        this.valor_renta = valor_renta;
        this.valor_adicional = valor_adicional;
    }

    public Integer getId() {
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

    public int getAgencia_automovil_id() {
        return agencia_automovil_id;
    }

    public void setAgencia_automovil_id(int agencia_automovil_id) {
        this.agencia_automovil_id = agencia_automovil_id;
    }

    public LocalDate getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(LocalDate fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public int getValor_renta() {
        return valor_renta;
    }

    public void setValor_renta(int valor_renta) {
        this.valor_renta = valor_renta;
    }

    public int getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(int valor_adicional) {
        this.valor_adicional = valor_adicional;
    }

    @Override
    public String toString() {
        return "ReservaAutomovil [id=" + id + ", idCliente=" + idCliente + ", agencia_automovil_id="
                + agencia_automovil_id + ", fecha_reserva=" + fecha_reserva + ", fecha_entrega=" + fecha_entrega
                + ", valor_renta=" + valor_renta + ", valor_adicional=" + valor_adicional + "]";
    }

    

    
    
}
