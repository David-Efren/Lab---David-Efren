import java.util.Scanner;

public class p077_DiaSemana {
    public static String diaSemana(int dia) {
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "No.";
        }
        return nombreDia;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7 :\t");
        int dia = obj.nextInt();
        String diaNombre = diaSemana(dia);
        System.out.println("El día de la semana es: " + diaNombre);
    }
}
