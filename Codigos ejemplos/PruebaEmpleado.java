public class PruebaEmpleado{
	
	public static void main(String[] args){
	
		Empleado e1 = new Empleado();
		e1.setId(12345);
		e1.setSueldoBase(500000);
		e1.setValorHoraExtra(30000);
		e1.setNHorasExtras(10);

		
		Empleado e2 = new Empleado(33333, 600000, 40000, 5);
		
		Empleado e3 = new Empleado(55555, 1000000);
		
		e1.montoNomina();
		e2.montoNomina();
		e3.montoNomina();
		
		double promedio = (e1.calculoSueldoBruto() + e2.calculoSueldoBruto() 
							+ e3.calculoSueldoBruto()) / 3;
							
	    System.out.println("Valor Promedio pagado: " + promedio);
	}

}