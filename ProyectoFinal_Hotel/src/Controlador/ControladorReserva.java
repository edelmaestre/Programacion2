package Controlador;

import Modelo.ArchivoReserva;
import Modelo.Reserva;
import java.util.ArrayList;
import java.util.Date;

public class ControladorReserva {
    private ArchivoReserva ar;

    public ControladorReserva() {
        this.ar = new ArchivoReserva("Reserva.dat");
    }

    public String Agregar(String Huesped, String Habitacion, Date f_reserva, Date f_llegada, Date f_salida) {
        Reserva re = new Reserva(Huesped, Habitacion, f_reserva, f_llegada, f_salida);
        ar.abrirArchivo();
        String msg = ar.Agregar(re);
        ControladorHabitacion cha = new ControladorHabitacion();
        cha.cambiarEstado(Habitacion);
        ar.cerrarArchivo();
        return msg;
    }

    public ArrayList<Reserva> Leer() {
        ar.abrirArchivo();
        ArrayList<Reserva> Listado = ar.Leer();
        ar.cerrarArchivo();
        return Listado;
    }

    public ArrayList<Reserva> Buscar(String documento) {
        ArrayList<Reserva> lista = Leer();
        ArrayList<Reserva> retorno = new ArrayList<>();
        for (Reserva r : lista) {
            if (r.getHuesped().equalsIgnoreCase(documento)) {
                retorno.add(r);
            }
        }
        return retorno;
    }
    public ArrayList<Reserva> BuscarH(String numero) {
        ArrayList<Reserva> lista = Leer();
        ArrayList<Reserva> retorno = new ArrayList<>();
        for (Reserva r : lista) {
            if (r.getHabitacion().equalsIgnoreCase(numero)) {
                retorno.add(r);
            }
        }
        return retorno;
    }

    public String Cancelar(String huesped) {
        try {
            ar.Cancelar(huesped);
            return "RESERVAS CANCELADAS";
        } catch (Exception e) {
            return "ERROR AL CANCELAR RESERVAS" + e;
        }
    }
}
