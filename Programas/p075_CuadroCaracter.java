import java.util.Scanner;

public class p075_CuadroCaracter {
    public static void Cuadro(int ren, int col, char car) {
        // doble ciclo, uno marca el renglon y otro las columnas 
        for (int i = 1; i <= ren; i++) {
            for (int j = 1; j <= col; j++)
                System.out.printf("%c ", car);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ren, col;
        char car;
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("DIBUJAR UN CUADRO DE CARACTERES");
        System.out.print("\n\tIngresa los renglones :\t"); ren = obj.nextInt();
        System.out.print("\n\tIngresa las columnas :\t");  col = obj.nextInt();
        System.out.print("\n\tIngresa el caracter :\t");
        car = Character.toUpperCase(obj.next().charAt(0));
        Cuadro(ren, col, car);
    }
}