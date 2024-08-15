/*
	Autor: jairo f.
	Fecha: 18-09-2015
	Descripcion: Permite imprimir la hora en formato 24H y modificar sus valores manualmente
*/

public class Tiempo{

	private int h, m, s;
	
	public Tiempo(int h, int m, int s){
		if(h<0 || h>23) this.h=0;
		else this.h=h;
		
		if(m<0 || m>59) this.m=0;
		else this.m = m;
		
		if(s<0 || s>59) this.s=0;
		else this.s = s;
	}
	
	public Tiempo(int h, int m){
		if(h<0 || h>23) this.h=0;
		else this.h=h;
		
		if(m<0 || m>59) this.m=0;
		else this.m = m;
		
		this.s=0;
	}
	
	public Tiempo(int h){
		if(h<0 || h>23) this.h=0;
		else this.h=h;
		
		this.m=0;
		this.s=0;
	}
	
	public Tiempo(){
		this.h=0;
		this.m=0;
		this.s=0;
	}
	
	public int getHH(){ return this.h;}
	public int getMM(){ return this.m;}
	public int getSS(){ return this.s;}
	
	public void setHH(int h){
		if(h>=0 && h<=23) 
		  this.h=h;
	}
	
	public void setMM(int m){
		if(m>=0 && m<=59)
		   this.m=m;
	}
	
	public void setSS(int s){
		if(s>=0 && s<=59)
		  this.s= s;
	}
	
	public void verHora(){
	  String HH, MM, SS;
	  if(this.h<10) HH = "0"+this.h+":";
	  else  HH = this.h+":";
	  
	  if(this.m<10) MM= "0"+this.m+":";
	  else MM = this.m+":";
	  
	  if(this.s<10) SS= "0"+this.s;
	  else SS = this.s+"";
	  
	  System.out.println("La hora actual es: " + HH + MM + SS);
	
	}
	
	
	
}


