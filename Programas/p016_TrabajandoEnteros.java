// Trabajando con variables y literales enteras

public class p016_TrabajandoEnteros {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x = 42;
		int y = 0x2a;// 42
		int z = 0b00101010;// también 42?
		long waos = 9223370368547780l;// l para especificar que es un long, este es literalmente el máximo
		System.out.println("FORMATO DE NÚMEROS ENTEROS");
		System.out.printf("\n\nNúmero en base decimal = %d",x); // %d = enteros
		System.out.printf("\nNúmero en base octal = %o",x); // %o imprime en octal, int se puede imprimir en otros formatos
		System.out.printf("\nNúmero en base hexadecimal = %x",x); // Mas de lo mismo 
		System.out.printf("\nNúmero en base decimal grandote = %,d",waos);// %,d para mostrarlo como decimal
		
		System.out.printf("\n\nTipo byte   min: %f  /  max: %f  /  bytes: %d", Byte.MIN_VALUE , Byte.MAX_VALUE,Byte.BYTES);
		System.out.printf("\n\nTipo short   min: %f  /  max: %f  /  bytes: %d", Short.MIN_VALUE , Short.MAX_VALUE,Short.BYTES);
		System.out.printf("\n\nTipo int   min: %f  /  max: %f  /  bytes: %d", Integer.MIN_VALUE , Integer.MAX_VALUE,Integer.BYTES);
		System.out.printf("\n\nTipo long   min: %f  /  max: %f  /  bytes: %d", Long.MIN_VALUE , Long.MAX_VALUE,Long.BYTES);
	}
}