/*
	autor:
	fecha:
	descripcion: 

*/
public class Empleado{
	private int id;
	private double sueldoBase;
	private double valorHE;
	private int nHorasExtras;

	public Empleado(){
		this.id=0;
		this.sueldoBase=0;
		this.valorHE=0;
		this.nHorasExtras=0;
	}
	
	public Empleado(int id, double sb, double vhe, int nhe){
		this.id = id;
		this.sueldoBase = sb;
		this.valorHE= vhe;
		this.nHorasExtras= nhe;
	}
	
	public Empleado(int id, double sb){
		this.id = id;
		this.sueldoBase = sb;
		this.valorHE= 0;
		this.nHorasExtras= 0;
	}
	
	public int getId(){return this.id;}
	public double getSueldoBase(){return this.sueldoBase;}
	public double getValorHoraExtra(){return this.valorHE;}
	public int getNHorasExtras(){return this.nHorasExtras;}
	
	public void setId(int id){this.id=id;}
	public void setSueldoBase(double sb){this.sueldoBase=sb;}
	public void setValorHoraExtra(double vhe){this.valorHE= vhe;}
	public void setNHorasExtras(int nhe){this.nHorasExtras = nhe;}
	
	public double conceptoHorasExtras(){
		return this.valorHE * this.nHorasExtras;
	}
	
	public double calculoSueldoBruto(){
		return this.sueldoBase + this.conceptoHorasExtras();
	}
	
	public void montoNomina(){
		System.out.println("Liquidacion Nomina de Empleado: ");
		System.out.println("Id: Empleado: " + this.id);
		System.out.println("Sueldo Base: " + this.sueldoBase);
		System.out.println("No Horas Extras: " + this.nHorasExtras);
		System.out.println("Valor Hora Extra: " + this.valorHE);
		System.out.println("Total Monto X Horas Extras: " + this.conceptoHorasExtras());
		System.out.println("Sueldo Bruto: " + this.calculoSueldoBruto());
		System.out.println("______________________________________");
	
	}
	
	
	
	
}