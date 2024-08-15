package Modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import proyectofinal_hotel.Funciones;

public class ArchivoHabitacion_Liquidada extends ArchivoPadre{
    public ArchivoHabitacion_Liquidada(String namae) {
        super(namae);
    }
    public String Agregar(Habitacion_Liquidada hl){
        if(this.aEscritura!=null){
            try {
                this.pw = new PrintWriter(this.aEscritura);
                pw.printf("%s;%.2f%n",hl.getNumero_habitacion(),hl.getCostoTotal());
                return "SE GUARDO CORRECTAMENTE";
            } catch (Exception e) {
                return "ERROR AL GUARDAR " + e;
            }
        }
        else{
            return "NO SE ENCONTRO ARCHIVO PARA ABRIR";
       }
    }
    public ArrayList<Habitacion_Liquidada> Leer(){
        ArrayList<Habitacion_Liquidada> Listado = new ArrayList<>();
        try{
            this.aLectura = new Scanner(this.getArchivo());
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                Habitacion_Liquidada hl = new Habitacion_Liquidada(linea[0],Double.parseDouble(linea[1].replace(",",".")));
                Listado.add(hl);
             }
            return Listado;
        }
        catch(java.io.IOException IOE){
            System.err.println("Error al abrir el archivo en modo lectura...");
            System.err.println("Exccepcion: " + IOE);
            return null;
        }
        finally{
            if(this.aLectura!=null)
                this.aLectura.close();
        }        
    }
}
