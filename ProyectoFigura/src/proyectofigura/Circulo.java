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
public class Circulo extends Figura {
    private double r;

    public Circulo() {
    }

    public Circulo(double r) {
        this.r = r;
    }

    public Circulo(double r, String nombre) {
        super(nombre);
        this.r = r;
    }

    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }
    
    
    @Override
    public void area(){
    double a= Math.PI*Math.pow(this.r,2);
        System.out.println("Area del"+this.getNombre()+": "+a);
    }
}
