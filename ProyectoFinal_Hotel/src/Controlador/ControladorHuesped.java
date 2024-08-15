package Controlador;
import Modelo.ArchivoHuesped;
import Modelo.Huesped;
import java.util.ArrayList;
public class ControladorHuesped {
    
    private ArrayList<Huesped> huesped;
    private ArchivoHuesped ah;

    public ControladorHuesped() {
        this.ah = new ArchivoHuesped("Huesped.dat");
    }
    
    public String Agregar(String nombre,String documento,String telefono){
        Huesped hu = new Huesped(nombre,documento,telefono);
        ah.abrirArchivo();
        String msg = ah.Agregar(hu);
        ah.cerrarArchivo();
        return msg;
    }
    public ArrayList<Huesped> Leer(){
        ah.abrirArchivo();
        ArrayList<Huesped> Listado = ah.Leer();
        ah.cerrarArchivo();
        return Listado;
    }
    public Huesped Buscar(String documento){
        ArrayList<Huesped> lista = Leer();
        for (Huesped h : lista) {
            if (h.getDocumento().equalsIgnoreCase(documento)) {
                return h;
            }
        }
        return null;
    }
}
