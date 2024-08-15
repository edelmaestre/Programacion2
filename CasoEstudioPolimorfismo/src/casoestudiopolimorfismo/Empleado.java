/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casoestudiopolimorfismo;

/**
 *
 * @author JAIRO F
 */
// super clase abstracta empleado
public abstract class Empleado implements PorPagar {

    private String nombre;
    private String apellido;
    private String cedula;

    public Empleado(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public Empleado() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public abstract double ingresos();

    @Override
    public void display() {

        System.out.println("-------------------------");
        System.out.println("Informacion del empledao:");
        System.out.println("CC      :      " + this.cedula);
        System.out.println("Nombre :    " + this.nombre);
        System.out.println("Apellido:   " + this.apellido);

    }

   

}
