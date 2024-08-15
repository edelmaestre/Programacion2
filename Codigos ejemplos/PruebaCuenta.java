public class PruebaCuenta{

	public static void main(String[] args){
		
		Cuenta c1, c2;
		c1= new Cuenta();
		c1.setNCuenta(888888);
		c1.setDniCliente(77097);
		c1.setP(0.2);
		c1.setSaldo(50000);
		
		c2=new Cuenta(77097, 100000, 0.6);
		System.out.println("Estado inicial de las cuentas: ");
		c1.verInformacion();
		c2.verInformacion();
		
		c1.retirar(50000);
		c1.consignar(10000);
		c1.actualizarSaldo();
		
		c2.retirar(200000);
		c2.consignar(100000);
		c2.actualizarSaldo();
		
		System.out.println("Estado final de las cuentas: ");
		c1.verInformacion();
		c2.verInformacion();
		
	}

}