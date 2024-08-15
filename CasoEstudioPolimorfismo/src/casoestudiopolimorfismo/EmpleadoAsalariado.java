/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casoestudiopolimorfismo;

/**
 *
 * @author JAIRO F
 */
public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

    public EmpleadoAsalariado(double salarioSemanal, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.salarioSemanal = salarioSemanal;
    }

    public EmpleadoAsalariado() {
    }

    /**
     * @return the salarioSemanal
     */
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    /**
     * @param salarioSemanal the salarioSemanal to set
     */
    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public double obtenerMontoPago() {
        return this.getSalarioSemanal();
    }

    @Override
    public double ingresos() {
        return this.getSalarioSemanal() * 4;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipo: Empleado Asalariado:    ");
        System.out.println("Ingresos Mensuales:     " + this.ingresos());
    }

}
