package Modelo;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoHabitacion extends ArchivoPadre{
    public ArchivoHabitacion(String namae) {
        super(namae);
    }
    public String Agregar(Habitacion ha){
        if(this.aEscritura!=null){
            try {
                this.pw = new PrintWriter(this.aEscritura);
                pw.printf("%s;%.2f;%s;%s%n",ha.getNumeroHabitacion(),ha.getCosto(),ha.getEstado(),ha.getTipo());
                return "SE GUARDO CORRECTAMENTE";
            } catch (Exception e) {
                return "ERROR AL GUARDAR " + e;
            }
        }
        else{
            return "NO SE ENCONTRO ARCHIVO PARA ABRIR";
       }
    }
    public ArrayList<Habitacion> Leer(){
        ArrayList<Habitacion> Listado = new ArrayList<>();
        try{
            this.aLectura = new Scanner(this.getArchivo());
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                Habitacion h = new Habitacion(linea[0],Double.parseDouble(linea[1].replace(",",".")),linea[2],linea[3]);
                Listado.add(h);
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
    public void modificar(String numero, Habitacion h){
        ArchivoHabitacion archivoAux = new ArchivoHabitacion("archivoAux.dat");
        try{
            this.aLectura = new Scanner(this.getArchivo());
            archivoAux.abrirArchivo();
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                if(linea[0].equals(numero)){
                    archivoAux.Agregar(h);
                }
                else{
                    Habitacion ha = new Habitacion(linea[0],Double.parseDouble(linea[1].replace(",",".")),linea[2],linea[3]);
                    archivoAux.Agregar(ha);
                }
            }
            
            this.aLectura.close();
            archivoAux.cerrarArchivo();
            
            if(this.getArchivo().delete()){
                archivoAux.getArchivo().renameTo(this.getArchivo());
            }
            else{
                System.out.println("Error al tratar de modificar el archivo...");
            }
        }
        catch(java.io.IOException IOE){
            System.err.println("Error al abrir el archivo en modo lectura\\escritura...");
            System.err.println("Exccepcion: " + IOE);
        }
    }
}
