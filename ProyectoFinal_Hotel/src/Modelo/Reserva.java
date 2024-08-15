package Modelo;

import java.util.Date;

public class Reserva {
    private String huesped;
    private String habitacion;
    private Date fecha_reserva;
    private Date fecha_llegada;
    private Date fecha_salida;

    public Reserva() {
    }

    public Reserva(String huesped, String habitacion, Date fecha_reserva, Date fecha_llegada, Date fecha_salida) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fecha_reserva = fecha_reserva;
        this.fecha_llegada = fecha_llegada;
        this.fecha_salida = fecha_salida;
    }
    public String getHuesped() {
        return huesped;
    }
    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }
    public String getHabitacion() {
        return habitacion;
    }
    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }
    public Date getFecha_reserva() {
        return fecha_reserva;
    }
    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }
    public Date getFecha_llegada() {
        return fecha_llegada;
    }
    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }
    public Date getFecha_salida() {
        return fecha_salida;
    }
    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    
}
