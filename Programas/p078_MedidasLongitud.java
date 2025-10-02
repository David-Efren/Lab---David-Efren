import java.util.Scanner;

public class p078_MedidasLongitud {
    public static double inchToCm(double inch) {
        return inch * 2.54;
    }

    public static double feetToMetros(double feet) {
        return feet * 0.3048;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		double res=0, temp=0;
		char op;
		
		System.out.println("ELIGE UNA OPCIÓN\n");
		System.out.println("\n  [ Z ] Pulgadas a Centímetros");
		System.out.println("\n  [ X ] Pies a Metros");
		System.out.println("\n  [ C ] Salir");
		op = obj.next().charAt(0);
		op = Character.toUpperCase(op);
		
		if (op == 'Z') {
			System.out.println("\n\nConvirtiendo de Pulgadas a Centímetros.");
			System.out.print("\n\tDa los pulgadas  :\t");temp= obj.nextDouble();
			res = inchToCm(temp);
			System.out.printf("\n%.2f\tpulgadas es igual a\t%.2f\tcentímetros",temp,res);
		} else
		if (op == 'X') {
			System.out.println("\n\nConvirtiendo de Pies a Metros.\n");
			System.out.print("\n\tDa los pies  :\t");temp= obj.nextDouble();
			res = feetToMetros(temp);
			System.out.printf("\n%.2f\tpies es igual a\t%.2f\tmetros",temp,res);
		} else
		if (op == 'C') {
			System.out.println("\n\nAdios.\n");
		} else {
			System.out.println("\n\nNo.");
		}
    }
}
