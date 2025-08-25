import java.util.Scanner;

public class p006_PromedioCalificaciones {
	public static void main(String[] args) {
            try (Scanner obj = new Scanner(System.in)) {
                float c1, c2, c3;
                float prom, may, men;
                System.out.println("Calcular promedio.");
                // Recibir
                System.out.print("\n\nIntroduce calificación 1: ");
                c1 = obj.nextFloat();
                System.out.print("\nIntroduce calificación 2: ");
                c2 = obj.nextFloat();
                System.out.print("\nIntroduce calificación 3: ");
                c3 = obj.nextFloat();
                // Proceso
                prom = (c1 + c2 + c3) / 30;
                men = Math.min(Math.min(c1,c2),c3);
                may = Math.max(Math.max(c1,c2),c3);
                // Salida
                System.out.printf("\n\nCalificaciones: %.2f, %.2f, %.2f",c1,c2,c3);
                System.out.printf("\nSuma            : %.2f",c1+c2+c3);
                System.out.printf("\nPromedio       : %.2f",prom);
                System.out.printf("\nMayor            : %.2f",may);
                System.out.printf("\nMenor            : %.2f",men);
                // Cerrar el scanner???????
            }
	}
}