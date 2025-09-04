import java.util.Scanner;

public class p025_EstacionesAño {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		int est;
		
		System.out.println("ELIGE");
		System.out.println("\n  [1]  Primavera");
		System.out.println("\n  [2]  Verano");
		System.out.println("\n  [3]  Otoño");
		System.out.println("\n  [4]  Invierno");
		System.out.print("\n\nEstacion?  "); est = obj.nextInt();

        if (est == 1) System.out.println("\n\nEscogiste:  Primavera!");
        if (est == 2) System.out.println("\n\nEscogiste:  Verano!");
        if (est == 3) System.out.println("\n\nEscogiste:  Otoño!");
        if (est == 4) System.out.println("\n\nEscogiste:  Invierno!");
    }
}
