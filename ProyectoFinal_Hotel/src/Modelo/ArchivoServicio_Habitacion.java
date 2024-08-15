package Modelo;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoServicio_Habitacion extends ArchivoPadre{
    public ArchivoServicio_Habitacion(String namae) {
        super(namae);
    }
    public String Agregar(Servicio_Habitacion s){
        if(this.aEscritura!=null){
            try {
                this.pw = new PrintWriter(this.aEscritura);
                pw.printf("%s;%d;%s;%.2f%n",s.getNumero_habitacion(),s.getCantidad(),s.getNombre(),s.getPrecio());
                return "SE GUARDO CORRECTAMENTE";
            } catch (Exception e) {
                return "ERROR AL GUARDAR " + e;
            }
        }
        else{
            return "NO SE ENCONTRO ARCHIVO PARA ABRIR";
       }
    }
    public ArrayList<Servicio_Habitacion> Leer(){
        ArrayList<Servicio_Habitacion> Listado = new ArrayList<>();
        try{
            this.aLectura = new Scanner(this.getArchivo());
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                Servicio_Habitacion s = new Servicio_Habitacion(linea[0],Integer.parseInt(linea[1]),linea[2],Double.parseDouble(linea[3].replace(",",".")));
                Listado.add(s);
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
