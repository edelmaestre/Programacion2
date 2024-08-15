public class ClasePrincipal{

	public static void main(String[] args){
	
		Coche auto1 = new Coche();
		auto1.setMarca("Ferrari");
		auto1.setModelo(2015);
		auto1.setMatricula("ABC - 123");
		auto1.setColor("Rojo");
		auto1.setNCaballos(600);
		auto1.setNPuertas(2);
		auto1.verPropiedades();
		
		Coche auto2 = new Coche("Maclaren", "Perla", "QWE - 675", 2016, 500, 1);
		auto2.verPropiedades();
		
		Coche auto3 = new Coche("PPP - 000", 30, 5);
		auto3.verPropiedades();
		
	}
}