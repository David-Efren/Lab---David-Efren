import java.util.Scanner;

public class p003_AreaTriangulo {
	public static void main(String[] args) {
            try (Scanner obj = new Scanner(System.in)) { // Me da advertencia si no lo envuelvo en un try
                int base, altura;
                float area;
                // Solicitar
                System.out.println("\nCalcular area de triangulo.");
                System.out.print("\n\nIngrese altura: ");
                altura = obj.nextInt(); // Java se detiene, obtiene valor y lo convierte a int
                System.out.print("\nIngrese base: ");
                base = obj.nextInt();
                // Calcular
                area = (base * altura) / 2;
                // Imprimir
                System.out.println("\nEl triangulo de base " + base + " y altura " + altura + " el area es " + area);
                System.out.println(String.format("\n(%d * %d) / 2 = %.2f", altura, base, area)); // %s = cadena  %d = entero  %f = float
                // Cerrar el scanner???????
            }
	}
}