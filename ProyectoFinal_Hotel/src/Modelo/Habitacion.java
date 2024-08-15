package Modelo;
public class Habitacion {
    private String numeroHabitacion;
    private Double costo;
    private String estado;
    private String tipo;

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, Double costo, String estado, String tipo) {
        this.numeroHabitacion = numeroHabitacion;
        this.costo = costo;
        this.estado = estado;
        this.tipo = tipo;
    }
    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }
    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }
    public Double getCosto() {
        return costo;
    }
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
