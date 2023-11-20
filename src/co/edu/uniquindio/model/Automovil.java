package co.edu.uniquindio.model;

public class Automovil {

    private int id;
    private int modelo;
    private int valor_Renta;
    private int valor_Adicional;
    private String placa;
    private String marca;
    private String tipo;
    private String gama;
    //private int estado;


    public Automovil() {
        super();
    }


    public Automovil(int id, int modelo, int valor_Renta, int valor_Adicional, String placa, String marca, String tipo,
            String gama) {
        this.id = id;
        this.modelo = modelo;
        this.valor_Renta = valor_Renta;
        this.valor_Adicional = valor_Adicional;
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.gama = gama;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getModelo() {
        return modelo;
    }


    public void setModelo(int modelo) {
        this.modelo = modelo;
    }


    public int getValor_Renta() {
        return valor_Renta;
    }


    public void setValor_Renta(int valor_Renta) {
        this.valor_Renta = valor_Renta;
    }


    public int getValor_Adicional() {
        return valor_Adicional;
    }


    public void setValor_Adicional(int valor_Adicional) {
        this.valor_Adicional = valor_Adicional;
    }


    public String getPlaca() {
        return placa;
    }


    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getGama() {
        return gama;
    }


    public void setGama(String gama) {
        this.gama = gama;
    }


    @Override
    public String toString() {
        return "Automovil [id=" + id + ", modelo=" + modelo + ", valor_Renta=" + valor_Renta + ", valor_Adicional="
                + valor_Adicional + ", placa=" + placa + ", marca=" + marca + ", tipo=" + tipo + ", gama=" + gama + "]";
    }

    


    
    
}
