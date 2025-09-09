import java.util.Scanner;

public class p050_ConversionTemperaturas {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        int ini, fin, c;
        float f = 0f;
        char resp;
        do {
            System.out.println("TABLA : GRADOS CELSIUS A FAHRENHEIT\n");
            do {
                System.out.print("\n  Inicio : "); ini = obj.nextInt();
                System.out.print("\n  Fin : "); fin = obj.nextInt();
            } while( fin < ini );
            c=ini;
            System.out.println("CELSIUS\t\tFAHRENHEIT"); // \t es tabulador.
            while( c<=fin ) {
                f = (c * 9/5) + 32;
                System.out.printf("%d\t°c\t%.2f\t°f\n",c,f);
                c++;
            }
            System.out.print("\n  Deseas continuar (S/N) ? ");resp = Character.toUpperCase(obj.next().charAt(0));
        } while( resp != 'N');
	}
}