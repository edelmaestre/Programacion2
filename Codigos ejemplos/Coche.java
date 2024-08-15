/*
	Autor: jairo f
	Fecha: 17-09-2015
	descripcion: imprime las caracteristocas de un coche
*/
public class Coche{

	private String color, marca, matricula;
	private int modelo, nCaballos, nPuertas;
	
	public Coche(){
		this.color = "";
		this.marca = "";
		this.matricula="";
		this.modelo=0;
		this.nCaballos = 0;
		this.nPuertas = 0;
	}
	
	public Coche (String marca, String color, String matricula, int modelo, 
			int nCaballos, int nPuertas){
				this.color = color;
				this.marca = marca;
				this.matricula=matricula;
				this.modelo=modelo;
				this.nCaballos = nCaballos;
				this.nPuertas = nPuertas;
	}
	
	public Coche (String matricula,	int nCaballos, int nPuertas){
				this.color = "Verde";
				this.marca = "Mazda";
				this.matricula=matricula;
				this.modelo=2004;
				this.nCaballos = nCaballos;
				this.nPuertas = nPuertas;
	}
	
	public String getColor(){ return this.color;}
	public void setColor(String color){	this.color=color;}
	
	public String getMarca(){return this.marca;	}
	public void setMarca(String marca){ this.marca=marca;}
	
	public String getMatricula(){return this.matricula;}
	public void setMatricula(String matricula){	this.matricula=matricula;}
	
	public int getModelo(){return this.modelo;}
	public void setModelo(int modelo){this.modelo=modelo;}
	
	public int getNCaballos(){return this.nCaballos;}
	public void setNCaballos(int nCaballos){this.nCaballos=nCaballos;}
	
	public int getNPuertas(){ return this.nPuertas;	}
	public void setNPuertas(int nPuertas){ this.nPuertas=nPuertas;}
	
	
	public void verPropiedades(){
		System.out.println("Informacion del Coche: ");
		System.out.println("----------------------------");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Color: " + this.color);
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Caballos de Fuerza: " + this.nCaballos);
		System.out.println("Numero de Puertas: " + this.nPuertas);
		System.out.println("-----------------------------");
	}
	

}