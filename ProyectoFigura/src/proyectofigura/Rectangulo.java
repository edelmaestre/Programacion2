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
public class Rectangulo extends Figura {
    private double b,a;

    public Rectangulo() {
    }

    public Rectangulo(double b, double a) {
        this.b = b;
        this.a = a;
    }

    public Rectangulo(double b, double a, String nombre) {
        super(nombre);
        this.b = b;
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }
    
    @Override
    public void area(){
        double a =this.b*this.a;
        System.out.println("Area del "+this.getNombre()+": "+a);
    }
}
