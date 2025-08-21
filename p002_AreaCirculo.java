//  Calcular area de circulo dado su radio

import java.util.Scanner;

public class p002_AreaCirculo {
	public static void main(String[] args) {
		double radio, area;
		Scanner scanner = new Scanner(System.in); // Se lee el radio con esto, gracias Java
		
		// Solicitar datos
		System.out.println("Calcular area de circulo.");
		System.out.print("\nIngrese el radio:"); // No se salta linea
		radio = scanner.nextDouble();
		
		// Calcular
		area = Math.PI * Math.pow(radio, 2);
		
		// Imprimir
		System.out.print("\nEl area del circulo con radio " + radio + " es: " + area);
	}
}