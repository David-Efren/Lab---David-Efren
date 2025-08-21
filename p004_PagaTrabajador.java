// Paga de trabajar salario por hora

import java.util.Scanner;

public class p004_PagaTrabajador {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int horas;
		double paga, tasa, impuesto, pagabruta, paganeta;
		String nombre;
		
		System.out.println("Calculadora pago.");
		// entrada
		System.out.print("\n\nIntroduce nombre de trabajador/a : "); nombre = obj.nextLine();
		System.out.print ("\nIntroduce horas trabajadas            : "); horas = obj.nextInt();
		System.out.print ("\nIntroduce paga por hora                : "); paga = obj.nextDouble();
		tasa = 0.03; // Tasa del 3%
		
		// Calculos
		pagabruta = horas * paga;
		impuesto = pagabruta * tasa;
		paganeta = pagabruta - impuesto;
		
		// resultado
		System.out.println(String.format("\n\nEl trabajador/a %s ha trabajado %d horas a una paga de %.2f por hora", nombre, horas, paga));
		System.out.println(String.format("\nPaga bruta   : %.2f\nImpuesto    : %.2f\nPaga neta   : %.2f", pagabruta, impuesto, paganeta));
	}
}