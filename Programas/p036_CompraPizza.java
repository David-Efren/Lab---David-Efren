import java.util.Scanner;

public class p036_CompraPizza {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String tamaño="";
		int sel, cant;
		float precio = 0f, preciobase=0f, preciototal=0f, descuento=0f;
		
		System.out.println("CALCULAR PIZZA Y DESCUENTO.\n");
		System.out.println("\n  [ 1 ]  Pizza pequeña  -  $5  "); 
		System.out.println("\n  [ 2 ]  Pizza mediana  -  $10  "); 
		System.out.println("\n  [ 3 ]  Pizza grande  -  $20  ");
		sel = obj.nextInt();
		
		switch (sel) {
			case 1 : precio = 5f; tamaño = "pequeña"; break;
			case 2 : precio = 10f; tamaño = "mediana"; break;
			case 3 : precio = 20f; tamaño = "grande";break;
			default : System.exit(0);
		}
		System.out.print("\n  Cantidad  :  "); cant = obj.nextInt();
		
		preciobase = precio * cant;
		
		if ( preciobase >= 2000) {
			descuento = preciobase * 0.15f;
			preciototal = preciobase - descuento;
			System.out.println("\n\nAPLICA DESCUENTO DEL 15%");
		} else {
			System.out.println("\n\nNO APLICA DESCUENTO DEL 15%");
		}
		
		System.out.printf("\n\n%d pizzas %s/s\n a %.2f  $  cada una.",cant, tamaño, precio);
		System.out.printf("\n  Precio base  :  %,.2f  $  pesos",preciobase);
		System.out.printf("\n  Descuento  :  %,.2f  $  pesos",descuento);
		System.out.printf("\n  PRECIO TOTAL  :  %,.2f  $  pesos\n",preciototal);
	}
}