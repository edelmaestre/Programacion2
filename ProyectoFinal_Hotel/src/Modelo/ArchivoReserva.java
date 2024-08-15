package Modelo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import proyectofinal_hotel.Funciones;

public class ArchivoReserva extends ArchivoPadre{
    public ArchivoReserva(String namae) {
        super(namae);
    }
    public String Agregar(Reserva r){
        if(this.aEscritura!=null){
            try {
                this.pw = new PrintWriter(this.aEscritura);
                pw.printf("%s;%s;%s;%s;%s%n",r.getHuesped(),r.getHabitacion(),Funciones.Date_A_Calendar(r.getFecha_reserva()),Funciones.Date_A_Calendar(r.getFecha_llegada()),Funciones.Date_A_Calendar(r.getFecha_salida()));
                return "SE GUARDO CORRECTAMENTE";
            } catch (Exception e) {
                return "ERROR AL GUARDAR " + e;
            }
        }
        else{
            return "NO SE ENCONTRO ARCHIVO PARA ABRIR";
       }
    }
    public ArrayList<Reserva> Leer(){
        ArrayList<Reserva> Listado = new ArrayList<>();
        try{
            this.aLectura = new Scanner(this.getArchivo());
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                Reserva r = new Reserva(linea[0],linea[1],Funciones.String_A_Date(linea[2]),Funciones.String_A_Date(linea[3]),Funciones.String_A_Date(linea[4]));
                Listado.add(r);
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
    public void Cancelar(String huesped){
        ArchivoReserva archivoAux = new ArchivoReserva("archivoAux.dat");
        try{
            this.aLectura = new Scanner(this.getArchivo());
            archivoAux.abrirArchivo();
            while(this.aLectura.hasNext()){
                String linea[] = this.aLectura.nextLine().split(";");
                if(!linea[0].equalsIgnoreCase(huesped)){
                    Reserva re = new Reserva(linea[0],linea[1],Funciones.String_A_Date(linea[2]),Funciones.String_A_Date(linea[3]),Funciones.String_A_Date(linea[4]));
                    archivoAux.Agregar(re);
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
