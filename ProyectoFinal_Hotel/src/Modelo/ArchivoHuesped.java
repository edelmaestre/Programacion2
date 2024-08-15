package Modelo;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoHuesped extends ArchivoPadre{

    public ArchivoHuesped(String namae) {
        super(namae);
    }
    public String Agregar(Huesped hu){
        if(this.aEscritura!=null){
            try {
                this.pw = new PrintWriter(this.aEscritura);
                pw.printf("%s;%s;%s%n",hu.getNombre(),hu.getDocumento(),hu.getTelefono());
                return "SE GUARDO CORRECTAMENTE";
            } catch (Exception e) {
                return "ERROR AL GUARDAR " + e;
            }
        }
        else{
            return "NO SE ENCONTRO ARCHIVO PARA ABRIR";
       }
    }
    public ArrayList<Huesped> Leer(){
        ArrayList<Huesped> Listado = new ArrayList<>();
        try{
            this.aLectura = new Scanner(this.getArchivo());
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                Huesped h = new Huesped(linea[0],linea[1],linea[2]);
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
}
