/*
   Autor: Elvin Carrillo
   Fecha: 16-09-2015
   Descripcion: permite calcular y perimetro de un rectangulo

*/

public class Rectangulo{
	 //definicion de atributos
	 private float base;
	 private float altura;
	 
	 //metodo constructor
	 public Rectangulo(){
		 this.base=0;
		 this.altura=0;	 
	 }
	 //metodo constructor sobrecargado
	 public Rectangulo(float base, float altura){
		 this.base= base;
		 this.altura= altura;
	 }
	
	//metodos getter y setter
	public float getBase(){return this.base;}
	public void setBase(float base){this.base = base;}
	
	public float getAltura(){return this.altura;}
	public void setAltura(float altura){this.altura=altura;}
	
	//metodos miembros: calularArea, CalcularPerimetro y verValores
	
	public float calcularArea(){
		float area;
		area= this.base * this.altura;
		return area;
		//return this.area * this.altura;
	}
	
	public float calcularPerimetro(){
		return 2*this.base + 2*this.altura;
	}
	
	public void verValores(){
		System.out.println("Valores del rectangulo: ");
		System.out.println("base: " + this.base);
		System.out.println("altura: " + this.altura);
		System.out.println("area: " + this.calcularArea());
		System.out.println("perimetro: " + this.calcularPerimetro());
		System.out.println(".....................................");
	}
}