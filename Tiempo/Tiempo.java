/*
Autor: Elvin Carrillo
Fecha: 18-09-2015
Descripcion: Permite imprimir la hora en formato 24H y moficar sus valores manuelmnete
*/

public class Tiempo{
	private int h, m, s;
	
	//contructores
	public Tiempo(int h, int m, int s){
		if(h<0)this.h=0;
		else if(h>23)this.h=23;
		else this.h=h;
		
		if(m<0 || m>59) this.m=0;
		else this.m=m;
		
		if(s<0 || s>59) this.s=0;
		else this.s=s;
	}
	
	
	public Tiempo(int h, int m){
		if(h<0)this.h=0;
		else if(h>23)this.h=23;
		else this.h=h;
		
		if(m<0 || m>59) this.m=0;
		else this.m=m;
		
		this.s=0;
		
	}
	
	public Tiempo(int h){
		if(h<0)this.h=0;
		else if(h>23)this.h=23;
		else this.h=h;
		
		this.m=0;
		
		this.s=0;
		
	}
	
	public Tiempo(){
		this.h=0;
		this.m=0;
		this.s=0;
	}
	
	//metodos Getter y Setter
	public int getHH(){return this.h;}
	public int getMM(){return this.m;}
	public int getSS(){return this.s;}
	
	public void setHH(int h){
		if(h>=0 && h<=23) this.h=h;
	}
	
	public void setMM(int m){
		if(m>=0 && m<=59) this.m=m;
	}
	
	public void setSS(int s){
		if(s>=0 && s<=59) this.s=s;
	}
	
	//metodos
	
	public void verHora(){
		String HH, MM, SS;
		
		if(this.h<10) HH= "0"+this.h+":";
		else HH=""+this.h+":";
		
		if(this.m<10) MM= "0"+this.m+":";
		else MM=""+this.m+":";
		
		if(this.s<10) SS= "0"+this.s+"";
		else SS=""+this.s+"";
		
		System.out.println("La Hora actual es: "+ HH+ MM+ SS);
		
	}
	
	public void verH(){
		String HH, MM, SS, m;

		if(this.h>12){
		   if(this.h==0 && this.h==0){
			   this.h=12;
			   HH=this.h+":";
			   m=" Am";
		   }
          else		   
		   this.h= this.h - 12;
		   HH=this.h+":";
		   m=" Pm";
		}  
		 else m=" Am";
		
		if(this.h<10) HH= "0"+this.h+":";
		else HH=""+this.h+":";
		
		if(this.m<10) MM= "0"+this.m+":";
		else MM=""+this.m+":";
		
		if(this.s<10) SS= "0"+this.s+" ";
		else SS=""+this.s+"";
		
	
			System.out.println("La Hora es: "+ HH+ MM+ SS+ m);
		
		
	}
	
	
}