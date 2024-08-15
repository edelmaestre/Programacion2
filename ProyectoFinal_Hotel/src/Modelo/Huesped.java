package Modelo;
public class Huesped {
    private String nombre;
    private String documento;
    private String telefono;

    public Huesped() {
    }

    public Huesped(String Nombre, String Documento, String Telefono) {
        this.nombre = Nombre;
        this.documento = Documento;
        this.telefono = Telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String Documento) {
        this.documento = Documento;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }
}
