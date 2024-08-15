package Controlador;

import Modelo.ArchivoHabitacion;
import Modelo.Habitacion;
import java.util.ArrayList;

public class ControladorHabitacion {

    private ArrayList<Habitacion> habitacion;
    private ArchivoHabitacion ah;

    public ControladorHabitacion() {
        this.ah = new ArchivoHabitacion("Habitacion.dat");
    }

    public String Agregar(Double costo, String tipo) {
        Integer numero = Leer().size()+1;
        Habitacion ha = new Habitacion(numero.toString(),costo,"LIBRE",tipo);
        ah.abrirArchivo();
        String msg = ah.Agregar(ha);
        ah.cerrarArchivo();
        return msg;
    }

    public ArrayList<Habitacion> Leer() {
        ah.abrirArchivo();
        ArrayList<Habitacion> Listado = ah.Leer();
        ah.cerrarArchivo();
        return Listado;
    }
    public Habitacion Buscar(String numero){
        ArrayList<Habitacion> lista = Leer();
        for (Habitacion h : lista) {
            if (h.getNumeroHabitacion().equalsIgnoreCase(numero)) {
                return h;
            }
        }
        return null;
    }
    public void cambiarEstado(String numero){
        Habitacion ha = Buscar(numero);
        if (ha.getEstado().equalsIgnoreCase("LIBRE")) {
            ha.setEstado("Reservada");
        }else{
            ha.setEstado("LIBRE");
        }
        this.ah.modificar(numero,ha);
    }
}
