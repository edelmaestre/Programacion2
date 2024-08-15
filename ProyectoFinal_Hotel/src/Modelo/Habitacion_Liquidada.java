package Modelo;
public class Habitacion_Liquidada {
    private String numero_habitacion;
    private Double costoTotal;

    public Habitacion_Liquidada() {
    }

    public Habitacion_Liquidada(String numero_habitacion, Double costoTotal) {
        this.numero_habitacion = numero_habitacion;
        this.costoTotal = costoTotal;
    }
    public String getNumero_habitacion() {
        return numero_habitacion;
    }
    public void setNumero_habitacion(String numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }
    public Double getCostoTotal() {
        return costoTotal;
    }
    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
}
