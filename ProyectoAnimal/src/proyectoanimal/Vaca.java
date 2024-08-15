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
public class Vaca extends Animal {
    
    private String v;

    public Vaca() {
    }

    public Vaca(String v) {
        this.v = v;
    }

    public Vaca(String v, String nombre) {
        super(nombre);
        this.v = v;
    }

    /**
     * @return the v
     */
    public String getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(String v) {
        this.v = v;
    }
    
    public void hablar(){
        System.out.println("La vaca dice: "+this.getV());
   }
    
}
