import java.util.Scanner;

public class p029_Calculadora {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double x,y;
        char op;
        System.out.println("CALCULADORA BÁSICA");
        System.out.print("\n  Ingresa el primer número           :  "); x = obj.nextDouble();
        System.out.print("\n  Ingresa el segundo número          :  "); y = obj.nextDouble();
        System.out.print("\n  Ingresa la operación  [ + - * / ]  :  "); op = obj.next().charAt(0);

        switch(op) {
            case '+':
                System.out.printf("\n  %.2f + %.2f = %.2f",x,y,(x+y));
                break;
            case '-':
                System.out.printf("\n  %.2f - %.2f = %.2f",x,y,(x-y));
                break;
            case '*':
                System.out.printf("\n  %.2f * %.2f = %.2f",x,y,(x*y));
                break;
            case '/':
                if (y != 0) {
                    System.out.printf("\n  %.2f / %.2f = %.2f",x,y,(x/y));
                } else {
                    System.out.println("\n  ERROR.");
                }
                break;
            default:
                System.out.println("\n  No.");
        }
    }
}
