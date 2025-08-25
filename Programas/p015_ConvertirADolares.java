import java.util.Scanner;

public class p015_ConvertirADolares {
   	public static void main(String[] args) {
            try ( // Declarar
                Scanner obj = new Scanner(System.in)) {
                float us,mx;
                System.out.println("Convertir Pesos Mexicanos a Dolares Estadounidenses.");
                // Leer
                System.out.print("\n\nIntroduce la cantidad en Pesos Mexicanos: ");
                mx = obj.nextFloat();
                // Calcular
                us = mx / 18.0f; // f hace que el numero sea obligatoriamente float y no double
                // Mostrar
                System.out.printf("\n\n%.2f Pesos Mexicanos son iguales a: %.2f Dolares Estadounidenses.",mx,us);
            }
	}
}