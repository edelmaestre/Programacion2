/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofigura;

import java.util.ArrayList;

/**
 *
 * @author PC-15
 */
public class ProyectoFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Figura f=new Figura("mi figura")
         ArrayList<Figura> listaDeFiguras=new ArrayList<>();
        
        Figura c=new Cuadrado(5,"Cuadrado");
        Figura r=new Rectangulo(10,15, "Rectangulo");
        Figura t=new Triangulo(10,15, "Triangulo");
        Figura ci=new Circulo(6, "Circulo");
        
        
        listaDeFiguras.add(c);
          listaDeFiguras.add(r);
            listaDeFiguras.add(t);
              listaDeFiguras.add(ci);
              
              
              for(Figura f: listaDeFiguras){
                 f.area();
              }
       
    }
    
}

//
//    //menu crear empleado asalariado
//    empleado por comision
//    empleado por hora
//    empleado base mas comision
//    5.) calcular imprimir nomina