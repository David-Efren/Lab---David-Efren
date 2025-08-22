import java.util.Scanner;

public class p008_FuncionesTrigonometricas {
	public static void main(String[] args) {
		//Entrada
		System.out.print("Ingresa un angulo en grados: ");
		double angulog = new Scanner(System.in).nextDouble();
		double angulor = Math.toRadians(angulog);
		//proceso
		double sen = Math.sin(angulor);
		double cos = Math.cos(angulor);
		double tan = Math.tan(angulor);
		//salida
		System.out.printf("\n\nRad: %.2f \nSeno: %.2f\nCoseno: %.2f\nTangente: %.2f",angulor, sen, cos, tan);
	}
}