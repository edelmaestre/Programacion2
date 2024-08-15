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
public class Gallo extends Animal {
    private String g;

    public Gallo() {
    }

    public Gallo(String g) {
        this.g = g;
    }

    public Gallo(String g, String nombre) {
        super(nombre);
        this.g = g;
    }

    
    
    
    
    /**
     * @return the g
     */
    public String getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(String g) {
        this.g = g;
    }
    
    
    @Override
   public void hablar(){
        System.out.println("El gallo dice: "+this.getG());
   }

    
}
