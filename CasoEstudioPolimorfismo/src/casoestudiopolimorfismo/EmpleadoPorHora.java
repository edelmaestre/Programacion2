/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package casoestudiopolimorfismo;

/**
 *
 * @author JAIRO F
 */
public class EmpleadoPorHora extends Empleado {

    private int nHoras;
    private double valorHora;
    private double pRecExtra;

    public EmpleadoPorHora(int nHoras, double valorHora, double pRecExtra, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.nHoras = nHoras;
        this.valorHora = valorHora;
        this.pRecExtra = pRecExtra;
    }

    public EmpleadoPorHora() {
    }

    /**
     * @return the nHoras
     */
    public int getnHoras() {
        return nHoras;
    }

    /**
     * @param nHoras the nHoras to set
     */
    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    /**
     * @return the valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the pRecExtra
     */
    public double getpRecExtra() {
        return pRecExtra;
    }

    /**
     * @param pRecExtra the pRecExtra to set
     */
    public void setpRecExtra(double pRecExtra) {
        this.pRecExtra = pRecExtra;
    }

    @Override
    public double ingresos() {
        double total;
        if (this.nHoras > 40) {
            int he = this.nHoras - 40;
            double vhe = this.valorHora + (this.valorHora * this.pRecExtra / 100);
            total = (40 * this.valorHora) + (he * vhe);
            return total;
        } else {
            return this.nHoras * this.valorHora;
        }
    }

    @Override
    public double obtenerMontoPago() {
        return this.ingresos();

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipo: Empelado Por Hora:   ");
        System.out.println("Ingresos:   " + this.ingresos());
    }
}
