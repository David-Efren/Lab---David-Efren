public class p020_ConversionTipos {
	public static void main(String[] args) {
		// Conversion implicita, el compilador lo hace automáticamente
		int var1 = 9;
		float var3= 123456.789f;
		double var2 = var1,var4=var3;
		
		System.out.printf("Implícita de int a double  :  %d  /  %f", var1, var2);// si se transforma aquí es implicita
		System.out.printf("\nImplícita de float a double  :  %f  /  %f",var3,var4);// si se transforma un formato en otro más grabde no oasa nada
		
		// Conversion explicita
		long var5 = 1234567890123456l;
		int var6 = (int)var5, var7 = 21448364;// tambien llamado casting
		short var8 = (short)var7;
		
		System.out.printf("\n\nExplicita de long a int  :  %d  /  %d",var5,var6); // long es más grande que int, al forzarlo con explicita se perdieron datos
		System.out.printf("\n\nExplicita de int a short  :  %d  /  %d",var7,var8); 
	}
}