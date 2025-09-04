import java.util.Scanner;

public class p026_TipoAngulo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float angle;

        System.out.println("VERIFICA EL TIPO DE ANGULO");
        System.out.print("Ingresa tu angulo  :  "); angle = obj.nextFloat();

        if(angle<90) System.out.println("Es agudo");

        if(angle==90) System.out.println("Es recto");

        if(angle>90 && angle<180) System.out.println("Es obtuso");

        if(angle==180) System.out.println("Es llano");

        if(angle>180 && angle<360) System.out.println("Es concavo");

        if(angle==360) System.out.println("Es completo");
    }
}
