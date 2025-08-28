public class p018_TrabajandoConstantes {
	
	static final double DESCUENTO = 0.10; // No cambia en cada instancia de la clase
	static final int VELOCIDADLUZ = 3000;
	static final float TASA = 0.5f;
	static final byte SEPARADOR = 113;
	
	public static void main(String[] args) {
		
		System.out.println("EL VALOR DE LA CONSTANTE ES:\n");
		System.out.printf("\n DESCUENTO x 2  :  %.2f", DESCUENTO*2);
		System.out.printf("\n VELOCIDAD / 2  :  %d", VELOCIDADLUZ/2);
		System.out.printf("\n TASA  :  %.2f", TASA);
		System.out.printf("\n SEPARADOR  :  %d", SEPARADOR);
	}
}