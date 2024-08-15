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
public class Gato extends Animal {
    private String ga;

    public Gato() {
    }

    public Gato(String ga) {
        this.ga = ga;
    }

    public Gato(String ga, String nombre) {
        super(nombre);
        this.ga = ga;
    }
    
    
    
   

    /**
     * @return the ga
     */
    public String getGa() {
        return ga;
    }

    /**
     * @param ga the ga to set
     */
    public void setGa(String ga) {
        this.ga = ga;
    }
    
    
     @Override
     public void hablar(){
        System.out.println("El gatoo dice: "+this.getGa());
   }
}
