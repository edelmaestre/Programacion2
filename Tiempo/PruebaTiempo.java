public class PruebaTiempo{
	
	public static void main(String[] args){
		Tiempo t1, t2, t3, t4;
		t1 = new Tiempo();
		t1.verHora();
		
		t2 = new Tiempo(7);
		t2.verHora();
		
		t3 = new Tiempo(7, 23);
		t3.verHora();
		
		t4 = new Tiempo(0, 23, 58);
		t4.verHora();
		t4.verH();
		
	}
}