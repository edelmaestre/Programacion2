/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoanimal;

/**
 *
 * @author PC-15
 */
public class Perro extends Animal {
    private String pe;

    public Perro() {
    }

    public Perro(String pe) {
        this.pe = pe;
    }

    public Perro(String pe, String nombre) {
        super(nombre);
        this.pe = pe;
    }

    /**
     * @return the pe
     */
    public String getPe() {
        return pe;
    }

    /**
     * @param pe the pe to set
     */
    public void setPe(String pe) {
        this.pe = pe;
    }
    
    @Override
    public void hablar(){
        System.out.println("El perro dice: "+this.getPe());
   }
    
}
