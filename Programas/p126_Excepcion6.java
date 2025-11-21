import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p126_Excepcion6 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner obj = new Scanner(System.in);

        System.out.print("Ingresa el nombre del archivo :\t");
        String nomarch = obj.nextLine();    

        try {
            File arch = new File(nomarch); // crear el objeto archivo
            obj = new Scanner(arch); // asociar el archivo al scanner, esto abre el archivo
            while (obj.hasNextLine()) { // leer linea por linea
                System.out.println(obj.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("eso no existe bruh");
        }
    }
}
