package Modelo;
public class Servicio_Habitacion {
    private String numero_habitacion;
    private int cantidad;
    private String nombre;
    private Double precio;

    public Servicio_Habitacion() {
    }

    public Servicio_Habitacion(String numero_habitacion, int cantidad, String nombre, Double precio) {
        this.numero_habitacion = numero_habitacion;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNumero_habitacion() {
        return numero_habitacion;
    }
    public void setNumero_habitacion(String numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
}
