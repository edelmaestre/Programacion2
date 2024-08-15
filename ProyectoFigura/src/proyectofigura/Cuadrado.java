/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofigura;

/**
 *
 * @author PC-15
 */
public class Cuadrado extends Figura{
    private double l;

    public Cuadrado() {
    }

    public Cuadrado(double l) {
        this.l = l;
    }

    public Cuadrado(double l, String nombre) {
        super(nombre);
        this.l = l;
    }

    /**
     * @return the l
     */
    public double getL() {
        return l;
    }

    /**
     * @param l the l to set
     */
    public void setL(double l) {
        this.l = l;
    }
    
    @Override
    public void area(){
          double a= Math.pow(this.l,2);
         System.out.println("Area del "+ this.getNombre()+": "+a);
    }
}
