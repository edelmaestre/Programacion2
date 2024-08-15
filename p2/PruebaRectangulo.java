public class PruebaRectangulo{
	
	public static void main(String[] args){
		
		Rectangulo r;
		r= new Rectangulo();
		r.setBase(10);
		r.setAltura(8);
		
		r.verValores();
		
		Rectangulo r2 = new Rectangulo(15, 8);
		r2.verValores();
	}
}