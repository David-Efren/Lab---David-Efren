package p108_Vehiculo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Compacto compacto = new Compacto("CP0100010122", "Honda", 2023, 25000.0, 5, 4);
        Compacto compacto2 = new Compacto("CP0200020345", "Toyota", 2022, 22000.0, 5, 4);
        Camioneta camioneta1 = new Camioneta("CM0100010567", "Ford", 2021, 35000.0, 3.5, 2);
        Camioneta camioneta2 = new Camioneta("CM0200020789", "Chevrolet", 2024, 42000.0, 4.0, 2);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(compacto);
        vehiculos.add(compacto2);
        vehiculos.add(camioneta1);
        vehiculos.add(camioneta2);

        double precioTotal = 0;
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        System.out.println("Calculando el precio total....");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.print(precioTotal);
            precioTotal += vehiculo.getPrecio();
        }
        System.out.printf("\n\tPrecio total de los vehículos :\t%.2f\t$\n", precioTotal);
    }
}
