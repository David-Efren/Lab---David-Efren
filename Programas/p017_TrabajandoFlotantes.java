public class p017_TrabajandoFlotantes {
	public static void main(String[] args) {
		float x = 423.45f;
		float y = 123;
		float z = 1.94e-8f;
		
		double a = 1232312321.424242d;
		double b = .3456;
		
		System.out.println("FORMATEO DE FLOTANTES CON STRING.FORMAT");
		System.out.println(String.format("\n\nx/y en formato flotante : %f / %f",x,y));
		System.out.println(String.format("\nx/y en formato flotante 2 decimales : %.2f / %.2f",x,y));
		System.out.println(String.format("\nx aliniado : %10.2f",x));
		System.out.println(String.format("\ny aliniado : %10.2f",y));
		System.out.println(String.format("\nz exponencial : %e",z)); // Notación científica creo
		System.out.println(String.format("\nz exponencial con decimales : %.2e",z));
		System.out.println(String.format("\na separador de miles y decimales : %,.2f",a)); //, separa en ,
		
		//siguiente hace masomenos lo mismo con printf
		
		System.out.printf("\n\nTipo float   min: %f  /  max: %f  /  bytes: %d", Float.MIN_VALUE , Float.MAX_VALUE,Float.BYTES);
		System.out.printf("\n\nTipo double   min: %f  /  max: %f  /  bytes: %d", Double.MIN_VALUE, Double.MAX_VALUE,Double.BYTES);
	}
}