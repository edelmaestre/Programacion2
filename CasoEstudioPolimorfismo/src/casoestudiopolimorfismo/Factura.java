/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoestudiopolimorfismo;

/**
 *
 * @author pc
 */
public class Factura implements PorPagar {

    private String numeropieza;
    private String descripciopieza;
    private int cantidad;
    private double precioarticulo;

    public Factura(String numeropieza, String descripciopieza, int cantidad, double precioarticulo) {
        this.numeropieza = numeropieza;
        this.descripciopieza = descripciopieza;
        this.cantidad = cantidad;
        this.precioarticulo = precioarticulo;
    }

    public Factura() {
    }
     public String getNumeropieza() {
        return numeropieza;
    }

    public void setNumeropieza(String numeropieza) {
        this.numeropieza = numeropieza;
    }

    public String getDescripciopieza() {
        return descripciopieza;
    }

    public void setDescripciopieza(String descripciopieza) {
        this.descripciopieza = descripciopieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioarticulo() {
        return precioarticulo;
    }

    public void setPrecioarticulo(double precioarticulo) {
        this.precioarticulo = precioarticulo;
    }

     public double calcularValor(){
     return this.getCantidad()*this.getPrecioarticulo();
     
     }
    @Override
    public double obtenerMontoPago() {
        return this.calcularValor();
    }

    @Override
    public void display() {
       // System.out.println(""+this.getNumeropieza()+"-"+this.getDescripciopieza()+
          //      "-"+this.getCantidad()+"-"+this.getPrecioarticulo()+"-"+this.calcularValor());
        System.out.println("numero de pieza:  "+this.getNumeropieza());
        System.out.println("descripcion    :  "+this.getDescripciopieza());
        System.out.println("cantidad       :  "+this.getCantidad());
        System.out.println("precio de articulo: "+this.getPrecioarticulo());
        System.out.println("valor total: "+this.calcularValor());
    }
    

   
}
