import java.util.Scanner;

public class p023_ConvertirTemperaturas {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		float res=0, temp=00;
		char op;
		
		System.out.println("ELIGE UNA OPCIÓN\n");
		System.out.println("\n  [ F ] Fahrenheit");
		System.out.println("\n  [ C ] Celsius");
		System.out.println("\n  [ S ] Salir");
		op = obj.next().charAt(0);
		op = Character.toUpperCase(op);
		
		if (op == 'F') {
			System.out.println("\n\nConvirtiendo de Celsius a Farenheit.");
			System.out.print("\n  Da los grados Celsius  :  ");temp= obj.nextFloat();
			res = (temp * (9f/5f)) + 32;
			System.out.printf("\n%.2f°c es igual a %.2f°f",temp,res);
		} else
		if (op == 'C') {
			System.out.println("\n\nConvirtiendo de Farenheit a Celsius.\n");
			System.out.print("\n  Da los grados Farenheit  :  ");temp= obj.nextFloat();
			res = (temp - 32f) * (5f / 9f);
			System.out.printf("\n%.2f°f es igual a %.2f°c",temp,res);
		} else
		if (op == 'S') {
			System.out.println("\n\nOk.");
		}
		else {
			System.out.println("\n\nNo.");
		}
		System.out.println("\n\nFin.");
	}
}