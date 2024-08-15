/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casoestudiopolimorfismo;

/**
 *
 * @author JAIRO F
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double base;

    public EmpleadoBaseMasComision(double base, double totalVentas, double tarifaComision, String nombre, String apellido, String cedula) {
        super(totalVentas, tarifaComision, nombre, apellido, cedula);
        this.base = base;
    }

    public EmpleadoBaseMasComision(double base) {
        this.base = base;
    }

    public EmpleadoBaseMasComision() {
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double ingresos() {
        return this.base + super.ingresos();
    }

    @Override
    public double obtenerMontoPago() {
        return this.ingresos();

    }

    @Override
    public void display() {
        System.out.println("Informacion del empledo: \n");
        System.out.println("CC         :" + this.getCedula());
        System.out.println("Nombre     :" + this.getNombre());
        System.out.println("Apellido   :" + this.getApellido());

        System.out.println("Tipo: Empeado Base Mas Comision");

        System.out.println("Ingreso    :" + this.ingresos());
    }
}
