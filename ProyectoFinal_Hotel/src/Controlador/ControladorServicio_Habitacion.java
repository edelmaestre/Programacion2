package Controlador;

import Modelo.ArchivoServicio_Habitacion;
import Modelo.Servicio_Habitacion;
import java.util.ArrayList;

public class ControladorServicio_Habitacion {
    private ArchivoServicio_Habitacion as;

    public ControladorServicio_Habitacion() {
        this.as = new ArchivoServicio_Habitacion("ServicioAlCliente.dat");
    }

    public String Agregar(String numero_habitacion, int cantidad, String nombre, Double precio) {
        Servicio_Habitacion ha = new Servicio_Habitacion(numero_habitacion,cantidad,nombre,precio);
        as.abrirArchivo();
        String msg = as.Agregar(ha);
        as.cerrarArchivo();
        return msg;
    }

    public ArrayList<Servicio_Habitacion> Leer() {
        as.abrirArchivo();
        ArrayList<Servicio_Habitacion> Listado = as.Leer();
        as.cerrarArchivo();
        return Listado;
    }
    public ArrayList<Servicio_Habitacion> Buscar(String numero){
        ArrayList<Servicio_Habitacion> lista = Leer();
        ArrayList<Servicio_Habitacion> lista2 = new ArrayList<>();
        for (Servicio_Habitacion s : lista) {
            if (s.getNumero_habitacion().equalsIgnoreCase(numero)) {
                lista2.add(s);
            }
        }
        return lista2;
    }
}
