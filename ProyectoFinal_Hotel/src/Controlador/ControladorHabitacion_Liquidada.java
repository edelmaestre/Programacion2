package Controlador;

import Modelo.ArchivoHabitacion_Liquidada;
import Modelo.Habitacion_Liquidada;
import java.util.ArrayList;

public class ControladorHabitacion_Liquidada {
    private ArchivoHabitacion_Liquidada ahl;

    public ControladorHabitacion_Liquidada() {
        this.ahl = new ArchivoHabitacion_Liquidada("HabitacionLiquidada.dat");
    }
    public String Agregar(String numero,Double costo){
        Habitacion_Liquidada ha = new Habitacion_Liquidada(numero,costo);
        ahl.abrirArchivo();
        String msg = ahl.Agregar(ha);
        ControladorHabitacion ch = new ControladorHabitacion();
        ch.cambiarEstado(numero);
        ahl.cerrarArchivo();
        return msg;
    }
    public ArrayList<Habitacion_Liquidada> Leer(){
        ahl.abrirArchivo();
        ArrayList<Habitacion_Liquidada> Listado = ahl.Leer();
        ahl.cerrarArchivo();
        return Listado;
    }
}
