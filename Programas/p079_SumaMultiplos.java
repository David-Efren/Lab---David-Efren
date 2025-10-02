import java.util.Scanner;

public class p079_SumaMultiplos {
    public static int sumaMultiplos(int ini, int fin, int n) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % n == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char op; int mult = 0;
		
		System.out.println("ELIGE UNA OPCIÓN\n");
		System.out.println("\n  [ Z ] Multiplos de 3");
		System.out.println("\n  [ X ] Multiplos de 4");
		System.out.println("\n  [ C ] Salir");
		op = obj.next().charAt(0);
		op = Character.toUpperCase(op);

        System.out.print("\n\tIntroduce el limite inferior :\t");
        int limiteInferior = obj.nextInt();

        System.out.print("\n\tIntroduce el limite superior :\t");
        int limiteSuperior = obj.nextInt();

        switch (op) {
            case 'Z':
                mult = 3;
                System.out.println("\n\nSumando múltiplos de 3 entre\t" + limiteInferior + "\ty\t" + limiteSuperior + "\t:");
                System.out.println(sumaMultiplos(limiteInferior, limiteSuperior, mult));   
                break;
            case 'X':
                mult = 4;
                System.out.println("\n\nSumando múltiplos de 4 entre\t" + limiteInferior + "\ty\t" + limiteSuperior + "\t:");
                System.out.println(sumaMultiplos(limiteInferior, limiteSuperior, mult));
                break;
            case 'C':
                System.out.println("\n\nAdios.\n");
                break;
            default:
                System.out.println("\n\nNo.");
        }
		
    }
}
