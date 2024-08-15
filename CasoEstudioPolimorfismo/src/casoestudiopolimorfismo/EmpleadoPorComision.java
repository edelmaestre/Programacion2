/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casoestudiopolimorfismo;

/**
 *
 * @author JAIRO F
 */
public class EmpleadoPorComision extends Empleado {

    private double totalVentas;
    private double tarifaComision;

    public EmpleadoPorComision(double totalVentas, double tarifaComision, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.totalVentas = totalVentas;
        this.tarifaComision = tarifaComision;
    }

    public EmpleadoPorComision() {
    }

    /**
     * @return the totalVentas
     */
    public double getTotalVentas() {
        return totalVentas;
    }

    /**
     * @param totalVentas the totalVentas to set
     */
    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    /**
     * @return the tarifaComision
     */
    public double getTarifaComision() {
        return tarifaComision;
    }

    /**
     * @param tarifaComision the tarifaComision to set
     */
    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double ingresos() {
        return (this.totalVentas * this.tarifaComision) / 100;
    }

    @Override
    public double obtenerMontoPago() {
        return this.ingresos();

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipo       : Empleado Por Comision");
        System.out.println("Ingresos   : " + this.ingresos());
    }

}
