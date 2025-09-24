import java.util.Scanner;

public class p067_ConversionTemperaturas {
    public static float Farenheit(float t) {
        return (t*9/5)+32;
    }
    public static float Celcius(float t) {
        return (t-32)*5/9;
    }
    public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
        float res, temp;
		char op;
		
		System.out.println("ELIGE UNA OPCIÓN\n");
		System.out.println("\n  [ F ] Fahrenheit");
		System.out.println("\n  [ C ] Celsius");
		System.out.println("\n  [ S ] Salir");
		op = obj.next().charAt(0);
		op = Character.toUpperCase(op);
		

        // Use un codigo anterior pero lo cambié a switch
        switch (op) {
            case 'F':
                System.out.println("\n\nConvirtiendo de Celsius a Farenheit.");
                System.out.print("\n  Da los grados Celsius  :  ");
                temp= obj.nextFloat();
                res = Farenheit(temp);
                System.out.printf("\n%.2f°c es igual a %.2f°f",temp,res);
                break;
            case 'C':
                System.out.println("\n\nConvirtiendo de Farenheit a Celsius.\n");
                System.out.print("\n  Da los grados Farenheit  :  ");
                temp= obj.nextFloat();
                res = Celcius(temp);
                System.out.printf("\n%.2f°f es igual a %.2f°c",temp,res);
                break;
            case 'S':
                System.out.println("\n\nOk.");
                break;
            default:
                System.out.println("\n\nNo.");
                break;
        }
		System.out.println("\n\nFin.");
	}
}
