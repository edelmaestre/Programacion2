/*
	 autor:
	 fecha:
	 descripcion: 
*/

public class Cuenta{
	private long nCuenta;
	private long dniCliente;
	private double saldo;
	private double p;
	
	
	public Cuenta(){
		this.nCuenta=0;
		this.dniCliente=0;
		this.saldo=0;
		this.p=0;
	}
	
	public Cuenta(long dni, double saldo, double p){
		this.nCuenta = 12345;
		this.dniCliente=dni;
		this.saldo=saldo;
		this.p=p;
	}
	
	public long getNCuenta(){ return this.nCuenta;}
	public long getDniCliente(){return this.dniCliente;}
	public double getSaldo(){return this.saldo;}
	public double getP(){return this.p;}
	
	public void setNCuenta(long nCuenta){ this.nCuenta=nCuenta;}
	public void setDniCliente(long dni){this.dniCliente=dni;}
	public void setSaldo(double saldo){this.saldo=saldo;}
	public void setP(double p){this.p=p;}
	
	public void actualizarSaldo(){
		this.saldo = this.saldo + this.saldo * this.p;
	}
	
	public void consignar(double valor){
		this.saldo +=valor;
	}
	
	public void retirar(double valor){
		if(this.saldo >0 && this.saldo>=valor)
			this.saldo-=valor;
	}
	
	public void verInformacion(){
		System.out.println("INFORMACION DE LA CUENTA");
		System.out.println("Numero Cuenta: " + this.nCuenta);
		System.out.println("dni Cliente: " + this.dniCliente);
		System.out.println("P: " + this.p);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("-----------------------------");
	}
	
	
}










