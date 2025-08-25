import java.util.Scanner;

public class p010_HipotenusaTriangulo {
	public static void main(String[] args) {
            try ( // Declarar
                    Scanner obj = new Scanner(System.in)) {
                double R,x,y;// math.sqrt acepta doubles y saca doubles, de otra forma hay perdidas de calidad oor la conversion
                System.out.println("Calcular hipotenusa de triángulo rectángulo.");
                // Leer
                System.out.print("\n\nIntroduce base         	:");
                x = obj.nextDouble();
                System.out.print("\nIntroduce altura           :");
                y = obj.nextDouble();
                // Calcular
                R = Math.sqrt((x*x)+(y*y));
                // Mostrar
                System.out.printf("\n\nLa hipotenusa de tu triangulo es	: %.2f",R);
                // Cerrar el scanner???????
            }
	}
}